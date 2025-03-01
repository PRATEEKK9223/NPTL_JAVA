public class RunnableX implements  Runnable{
    public void run(){
        try{
        for(int i=0;i<5;i++){
            System.out.println("RunnableX is Running..."+i);
            Thread.sleep(100);
        }
    }catch(InterruptedException e){
        System.out.println(e);
    }
        
    }

    
}
