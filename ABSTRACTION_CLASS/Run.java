package ABSTRACTION_CLASS;



public class Run {
    public static void main(String args[]){
        //creation of arry of objects refenece
        Geograpy Geo[]=new Geograpy[2];

        Geo[0]=new Circle(5);
        Geo[1]=new Rectangle(5,10);

        for(int i=0;i<2;i++){
            Run.Display(Geo[i].area(),Geo[i].circumference());
        }

    }
     static void  Display(double area,double circumference){
        System.out.println("Area = "+area);
        System.out.println("Circumference = "+circumference);

    }
    
}
