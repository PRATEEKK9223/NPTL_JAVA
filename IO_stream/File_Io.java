import java.io.*;

public class File_Io {
    public static void main(String[] arg){
        File file =new File("input.dat");

        if(file.exists()){
            System.out.println("name ="+file.getName());
            System.out.println("path ="+file.getPath());
            System.out.println("parent ="+file.getParent());
            System.out.println("absolutepath ="+file.getAbsolutePath());
        }
        else{
            System.out.println("File does not exist");
        }
        System.out.println("File is hidden ="+file.exists());
        System.out.println("File is directory ="+file.isDirectory());
        System.out.println("File is file ="+file.isFile());
        System.out.println("File is readable ="+file.canRead());
        System.out.println("File is writable ="+file.canWrite());
    
    }
}
