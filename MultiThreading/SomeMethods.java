public class SomeMethods {
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println(Thread.currentThread().getName()+" is Running...");
                Thread.sleep(10);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
    
}
