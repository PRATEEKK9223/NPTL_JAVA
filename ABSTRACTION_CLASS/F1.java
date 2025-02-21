package ABSTRACTION_CLASS;

abstract class Geograpy{
    public float PI=3.142f;
    public abstract double area();
    public abstract double circumference();
    void Normal_fun(){
        System.out.println("also have Normal function inside the abstraction class");
        System.out.println("For abstraction class you can not be instantiated");
       }
}

class Circle extends Geograpy{
    int radius;
    Circle(int radius){
        this.radius=radius;
    }

    public double area(){
        return PI*radius*radius;
    }
    public double circumference(){
        return 2*PI*radius;
    }

    int GetPrice(){
        return 500;
    }
    public static void Details(){
        System.out.println("In AbSTRACT_CLASS Package Circle classs");
    }
}

