package INTERFACE;

interface Geography {
    public final float PI=3.142f;//here varialbles are implicitly PUBLIC, STATIC & FINAL
    public abstract float area();
    float circumference(); // In interface the methods are implicitly PUBLIC & ABSTRACT
}



class Circle implements Geography{
    int radius;
    Circle(int radius){
        this.radius=radius;
    }

    public float area(){
        return PI*radius*radius;
    }
    public float circumference(){
        return 2*PI*radius;
    }

    static int GetPrice(){
        return 500;
    }
}
