import java.io.File;


public class File_class{
    public static void main(String[] args){
       
        try{
            File file=new File("C:\\NPTL_JAVA\\IO_stream\\test.txt");
            file_path(file);
            File_info(file);

        }catch(Exception e){
            System.out.println(e);
        }

    }

    public static void file_path(File f){
        System.out.println("File name : "+ f.getName());
        System.out.println("File path : "+ f.getPath());
        System.out.println("File absolutepath : "+ f.getAbsolutePath());
        System.out.println("File parent : "+ f.getParent());
    }

    public static void File_info(File f){
        System.out.println("File Exists : "+ f.exists());
        System.out.println("Can Write : "+ f.canWrite());
        System.out.println("cab read: "+ f.canRead());
        System.out.println("File Size : "+ f.length()+"bytes");
    }
}