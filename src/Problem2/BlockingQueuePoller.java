package Problem2;


public class BlockingQueuePoller<E> extends Thread {
    private BlockingQueue<E> queue;
    public BlockingQueuePoller(BlockingQueue<E> queue) {
        this.queue = queue;
    }
    
    public void run() {
        E element = this.queue.poll();
        System.out.println(element);
    }
}
