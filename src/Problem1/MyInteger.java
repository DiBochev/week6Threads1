package Problem1;

public class MyInteger {
    //private Object lock = new Object();
    public Integer myInteger = 0;

    public boolean isAvailable = true;
    
    public void increment() {
        
        //for (int i = 0; i < 2000000; i ++) {            
            this.myInteger++;
            //System.out.println(Thread.currentThread().getName() + ":" + this.myInteger);
       // }       
    }
    
    public synchronized boolean isMaxValue() {
        return this.myInteger>= 4000;
    }
}