package INTERFACE.MULTIPLE_INHERTENCE;
import INTERFACE.*;

interface first{
    int num1=1;
    void display1();
}
interface second{
    int num2=2;
    void display2();
}

class A {
   void  Display(){
        System.out.println("in A class");
    }
}

public class A1 extends A implements first,second{
    public void display1(){
        System.out.println("in class A1 of interface first " +num1);
    }
    public void display2(){
        System.out.println("in class A1 of interface first "+num2);
    }
    
}
