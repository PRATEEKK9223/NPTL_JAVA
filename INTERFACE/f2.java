package INTERFACE;

class Rectangle implements Geography{
    int length;
    int breadth;
    Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public float area(){
        return length*breadth;
    }
    public float circumference(){
        return 2*(length+breadth);
    }

    static int GetPrice(){
        return 1000;
    }
    
}
