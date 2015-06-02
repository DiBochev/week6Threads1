package Problem2;

public class BlockingQueueAdder<E> extends Thread {
    private BlockingQueue<E> queue;
    private E element;
    public BlockingQueueAdder(BlockingQueue<E> queue, E element) {
        this.queue = queue;
        this.element = element;
    }
    
    public void run() {
        try {
            Thread.sleep(20000l);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        this.queue.add(this.element);
    }
}