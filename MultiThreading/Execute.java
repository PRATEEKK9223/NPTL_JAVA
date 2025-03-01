public class Execute {
    public static void main(String args[]){
        //Thread creation 
        ThreadX t1 =new ThreadX();
        ThreadY t2 =new ThreadY();

        //to start the execution of threaads you must call the start method
        t1.start();
        t2.start();


    }
    
}
