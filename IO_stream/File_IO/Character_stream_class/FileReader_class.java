import java.io.FileReader;
import java.io.File;

//this class read the value characte by charcter (but FileiputStream class byte by byte)
public class FileReader_class{
    public static void main(String arg[]){
        try{
            File file=new File("C:\\NPTL_JAVA\\IO_stream\\test.txt");
            FileReader Rfile=new FileReader(file);

            int n=Rfile.read();
            System.out.println(n);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}