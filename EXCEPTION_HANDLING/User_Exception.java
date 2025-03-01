public class User_Exception {
    public  void divid(){
        int number1=10;
        int number2=0;
        try{
            if(number2==0)
            {
                throw new DivisionByZero("you can Not divid by 0");
            }
            int Qutiont=number1/number2;
            System.out.println("Qutiont= "+Qutiont);   
        }
        catch(DivisionByZero e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("End.....");
        }
    }
    public static void main(String args[]){
        User_Exception obj=new User_Exception();
        obj.divid();
       
    }
}

class DivisionByZero extends Exception{
    DivisionByZero(String meassage){
        super(meassage);
    }
}


