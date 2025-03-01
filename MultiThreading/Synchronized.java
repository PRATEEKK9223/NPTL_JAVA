class Myclass{
    // if we do not do the function as a synchronzed it will run the two threads in randomly
    // when we do the method as a synchronized when one tread is wait for completeion of onother thread 
    public synchronized void print(int n){
        try{
            for(int i=1;i<=5;i++){
                System.out.println(n*i);
                Thread.sleep(400);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
       
    }
}

class Myclass2 extends Thread{
    Myclass obj;
    Myclass2(Myclass obj){
        this.obj=obj;
    }
    public void run(){
        obj.print(2);
    }
}
class Myclass3 extends Thread{
    Myclass obj;
    Myclass3(Myclass obj){
        this.obj=obj;
    }
    public void run(){
        obj.print(100);
    }
}
public class Synchronized {
    public static void main(String args[]){
        Myclass obj=new Myclass();
        Myclass2 t1=new Myclass2(obj);
        Myclass3 t2=new Myclass3(obj);

        t1.start();
        t2.start();



    }
}
