import java.io.RandomAccessFile;
import java.io.IOException;

public class RandomAcessFile_class {
    public static void main(String[] args) {
        RandomAccessFile file1=null;
        RandomAccessFile file2=null;
        try {
                file1=new RandomAccessFile("C:\\NPTL_JAVA\\IO_stream\\test.txt","rw");
                file2=new RandomAccessFile("C:\\NPTL_JAVA\\IO_stream\\output.txt","rw");
                int value;
                while((value=file1.read())!=-1){
                    file2.write(value);
             }

                System.out.println("Copying the file successfuly....");

        } catch (IOException e) {
            e.printStackTrace();
        }
       
    }
} 
 