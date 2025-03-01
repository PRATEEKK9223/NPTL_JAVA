public class RunnableY implements Runnable{
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println("RunnableY Running...."+i);
                Thread.sleep(10);
            }
        }catch(InterruptedException e){
            System.out.println(e);

        }
    }
    
}
