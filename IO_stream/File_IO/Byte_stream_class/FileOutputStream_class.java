import java.io.FileOutputStream;
import java.io.IOException;

//here all values tahes as a ASCII value

public class FileOutputStream_class{
    public static void main(String arg[]){
        try{
            FileOutputStream file=new FileOutputStream("C:\\NPTL_JAVA\\IO_stream\\test.txt");
            file.write(90);

            String str="hello prateek";
            byte array[]=str.getBytes();
            file.write(array);//you can write only ASCII value you can not write integer,String,directly

            byte array2[]={'A','B','C','D'};

            file.write(array2);
            file.write('A' );
            file.close();
            file.write('K');//once file close it not working

        }catch(IOException e){
            System.out.println(e);
        }
    }
} 