class BOX{
    String colour;
    String name;
    float price;
    String Origin="US";

    BOX(String colour ,String name,float price){
        this.colour=colour;
        this.name=name;
        this.price=price;
    }
    BOX(){
        System.out.println("Inside BOX DEfault constructor");
    }
    
    void Display(){
        System.out.println("Inside BOX class");
        System.out.println("colour = "+colour);
        System.out.println("name = "+name);
        System.out.println("price = "+price);

    }
}

class Rectangle extends BOX{
    private int length;
    int breadth;
    String Origin="India";

    Rectangle(int l,int b,String colour,String name,float price){
        super(colour,name,price);
        length=l;
        breadth=b;
    }
    Rectangle(){
        System.out.println("Inside Rectangle class constructor");
        super.Display();//this will call the parent classs  DIsplay method
    }
    void Display(){
        System.out.println("Inside Rctangle class");
        System.out.println("colour = "+colour);
        System.out.println("name = "+name);
        System.out.println("price = "+price);
        System.out.println(" BOX Origin  = "+super.Origin);//super keyword also used to referse the parent class fields or methods 
        System.out.println(" Rectangle Origin  = "+Origin);
    }

    void area(){//it can not be private becase outside this class it not visiblle
        int res=length*breadth;
        System.out.println("Area = "+res);
    }
}
