import java.io.FileInputStream;

public class FileInputStream_class {
    public static void main(String args[]){
        try{
            FileInputStream file=new FileInputStream("C:\\NPTL_JAVA\\IO_stream\\test.txt");

            int n=file.read(); //you can read only using int you can not read data from other datatypes
            System.out.println((char)n);
            
            //to read evrey data from the file

            int value;
            while((value=file.read())!= -1){
                System.out.println((char)value);
            }

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
