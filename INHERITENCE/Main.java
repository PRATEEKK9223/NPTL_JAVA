public class Main {
    public static void main(String args[]){
        Rectangle Rec=new Rectangle(2,3,"red","rectangle",1000);
      
        Rec.area();
        Rec.Display();

        System.out.println("OBJECT-2..................");
        Rectangle obj2 =new Rectangle();
        obj2.area();
        obj2.Display();
    }
    
}
