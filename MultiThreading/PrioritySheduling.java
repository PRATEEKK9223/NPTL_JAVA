//here Thread class contains 3 static variables to set the riority of the thread
//MAX_PRIORITY=10
//MIN_PRIORITY=1
//NORM_PRIORITY=5

public class PrioritySheduling  {
    public static void main(String arg[]){

        Yeild_fun t1=new Yeild_fun();
        ThreadX t2=new ThreadX();
        ThreadY t3 =new ThreadY();

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);  
        t1.start(); 
        t2.start();
        t3.start();

    }
    


    
}
