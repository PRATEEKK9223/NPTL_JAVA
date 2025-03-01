public class Execute_Runnable {
    public static void main(String ars[]){
        //object creation
        RunnableX X=new RunnableX();
        RunnableY Y=new RunnableY();

        //Thread creation 

        Thread t1=new Thread(X);
        //Thread t1=new Thread(new RunnableX());

        //Thread t2=new thread(Y);
        Thread t2 =new Thread(new RunnableY());

        //start the execution of threads 

        t1.start();
        t2.start();
    }
    
}
