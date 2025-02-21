package INTERFACE;


public class Execute {
    public static void main(String args[]){

        Geography obj[]=new Geography[2];

        obj[0]=new Circle(10);
        obj[1]=new Rectangle(2,5);

        System.out.println(obj[0].area());
        System.out.println(obj[0].circumference());
        System.out.println(Circle.GetPrice());
       
        System.out.println(obj[1].area());
        System.out.println(obj[1].circumference());
       System.out.println(Rectangle.GetPrice());




    }
    
}
