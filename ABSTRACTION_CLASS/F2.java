package ABSTRACTION_CLASS;

class Rectangle extends Geograpy{
    int width;
    int length;
    Rectangle(int width,int length){
        this.width=width;
        this.length=length;
    }
    public double area(){
        return length*width;
    }
    public double circumference(){
        return 2*(length+width);
    }

    int GetPrice(){
        return 1000;
    }
}
