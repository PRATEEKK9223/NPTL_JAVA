import java.lang.Exception;

public class Try_catch extends Exception{
    public static void main(String args[]){
        try{
            int X=args.length;
            System.out.println("length of the command line array is "+X);
            //System.out.println(args[2]);

            int n1=10;
            int n2=0;
            int res=n1/n2;
            System.out.println("Qutionte= "+res);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
        catch(ArithmeticException e){
            System.out.println("Divided by zero not possible");
            System.out.println(e.getMessage());
        }
        catch(Exception e){
           
            //System.out.println(e.printStackTrace());
        }
        finally{
            System.out.println("End of the program");
        }
    }

}

