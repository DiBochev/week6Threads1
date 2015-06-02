package Problem1;


public class ThreadsMain {
//    public static MyInteger i = null;
//    public static boolean isInitiated = false;
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
       
        
        
        MyInteger i = new MyInteger();
        
        VariableIncrementor threadOne = new VariableIncrementor(i);       
        VariableIncrementor threadTwo = new VariableIncrementor(i);         
        threadOne.start();
        threadTwo.start();
        
        threadOne.join();
        threadTwo.join();
        
        System.out.println(i.myInteger);
        
        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }    
}