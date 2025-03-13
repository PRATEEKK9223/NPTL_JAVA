import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile2 {
    public static void main(String arg[]){
        try{
            RandomAccessFile file=new RandomAccessFile("C:\\NPTL_JAVA\\IO_stream\\test.txt", "rw");

            file.writeInt(100);
            file.writeLong(1034);
            file.writeBoolean(false);
            file.write('A');
            //file.writeFloat(3.132);

            int value;    
            while((value=file.read())!=-1){
                System.out.println((char)value);
            }
          

        }catch(IOException e){
            System.out.println(e);
        }
        
    }
    
}
