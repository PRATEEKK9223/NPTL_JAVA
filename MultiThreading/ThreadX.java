public class ThreadX extends Thread{
    public void run(){
        try{
        for(int i=1;i<=5;i++){
            System.out.println(i);
            Thread.sleep(100);
        }
    }catch(InterruptedException e){
        System.out.println(e);
    }   
}
}

