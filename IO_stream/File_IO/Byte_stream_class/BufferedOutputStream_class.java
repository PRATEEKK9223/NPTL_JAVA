import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedOutputStream;

public class BufferedOutputStream_class {
     public static void main(String arg[]){
        try{
            FileOutputStream file=new FileOutputStream("C:\\NPTL_JAVA\\IO_stream\\test.txt");
            BufferedOutputStream Bfile=new BufferedOutputStream(file);
            file.write(90);

            String str="hello prateek";
            byte array[]=str.getBytes();
            Bfile.write(array);//you can write only ASCII value you can not write integer,String,directly

            byte array2[]={'A','B','C','D'};

            Bfile.write(array2);
            Bfile.write('A' );
            Bfile.close();
            Bfile.write('K');//once file close it not working

        }catch(IOException e){
            System.out.println(e);
        }
    }
}
