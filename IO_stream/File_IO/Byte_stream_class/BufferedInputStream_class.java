import java.io.FileInputStream;
import java.io.BufferedInputStream;

//BufferedInputStream class is similar to FileInputStream but it stores the value in buffer in center so it is faster

public class BufferedInputStream_class {
    public static void main(String args[]){
        try{
            FileInputStream file=new FileInputStream("C:\\NPTL_JAVA\\IO_stream\\test.txt");
            BufferedInputStream Bfile=new BufferedInputStream(file);

            int n=Bfile.read(); //you can read only using int you can not read data from other datatypes
            System.out.println((char)n);
            
            //to read evrey data from the file

            int value;
            while((value=Bfile.read())!= -1){
                System.out.println((char)value);
            }

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
