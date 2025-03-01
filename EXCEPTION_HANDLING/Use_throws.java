/*With throws keyword: The method declares that it can throw the 
DivisionByZero exception, and the caller of the method is 
responsible for handling it.*/


public class Use_throws {
    void Division() throws DivisionByZero,ArrayIndexOutOfBoundsException{
        int number1=10;
        int number2=04;
        if(number2==0)
            throw new DivisionByZero("number != 0");
        int res=number1/number2;
        System.out.println("Qutiont= "+res);
        int array[]={1,2};

        System.out.println(array[2]);
    }

    public static void main(String args[]){
        Use_throws ob =new Use_throws();
        try{
            ob.Division();
        }
        catch(DivisionByZero e){
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("End of the program");
        }

    }


}
