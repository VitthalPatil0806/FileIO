import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Util2 {
    public static void fileInputStream(String filepath){

        File file = new File(filepath);

        if(!file.exists()){
            return;
        }
        if(!file.canRead()){
            return;
        }

        try{
            FileInputStream fin = new FileInputStream(filepath);
            long startTime = System.currentTimeMillis();
            int ch;

            while((ch = fin.read()) != -1){
                System.out.println((char)ch +" ");
            }
            fin.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
