import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Util {
    public static void main(String args[]){

        File file = new File("C:\\Users\\Udhav\\Desktop\\Newfile\\Myinfo.txt");

        if(!file.exists()){
            return;
        }
        if(!file.canRead()){
            return;
        }

        try{
            FileInputStream fin = new FileInputStream(file);
            long startTime = System.currentTimeMillis();
            int ch;

            while ((ch = fin.read()) != -1){
                System.out.println((char)ch+" ");
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
