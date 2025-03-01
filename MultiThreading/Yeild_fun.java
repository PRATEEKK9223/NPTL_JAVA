//yield method is used to pause the execution of the current thread and give the chance to the remaining threads of same priority. If there is no waiting thread or all the waiting threads have a lower priority then the same thread will continue its execution.
//yield method is a static method and it is available in Thread class. It is a native method.

public class Yeild_fun extends Thread{
    public void run(){
        try{
        for(int i=1;i<=5;i++){
            System.out.println("yeild method is running..."+i);
            //Thread.sleep(100);
            Thread.yield();//this will pause the execution of the current thread and give the chance to the remaining threads of same priority.
        }

    }catch(Exception e){
        System.out.println(e);
    }

    
    }
}