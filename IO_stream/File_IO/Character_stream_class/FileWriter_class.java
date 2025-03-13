import java.io.FileWriter;
import java.io.File;

public class FileWriter_class {
    public static void main(String arg[]){
        try{
            File file=new File("C:\\NPTL_JAVA\\IO_stream\\test.txt");
            FileWriter Wfile=new FileWriter(file);
    
            Wfile.write("Hello World");
            Wfile.write(100);
            Wfile.write("prateek");
            Wfile.write(1000);
            Wfile.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
