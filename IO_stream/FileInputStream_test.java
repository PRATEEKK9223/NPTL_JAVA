import java.io.File;
import java.io.FileInputStream;
import java.io.IOError;
import java.io.IOException;

public class FileInputStream_test {
    public static void main(String arg[]){
        
            File file =new File("input.dat");
            FileInputStream Infile = new FileInputStream(file);
        

        System.out.println("File is hidden ="+Infile.read());


       
    }
    
}
