package Problem1;

public class VariableIncrementor extends Thread {
    private MyInteger intLock;

    public VariableIncrementor(MyInteger i) {
        this.intLock = i;
    }

    // volatile Boolean lock;
    public void run() {
        for (int i = 0; i < 2000000; i++) {
            synchronized (this.intLock) {

                while (!this.intLock.isAvailable) {
                    try {
                        intLock.wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        throw new RuntimeException(e);
                    }
                }

                this.intLock.isAvailable = false;
                this.intLock.increment();
                this.intLock.isAvailable = true;

                intLock.notifyAll();
            }
        }
    }
}