package Problem2;


public class BlockingQueueMain {

    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new BlockingQueue<Integer>();
        Integer number = 10;
        BlockingQueuePoller<Integer> poller = new BlockingQueuePoller<Integer>(queue);
        BlockingQueueAdder<Integer> adder = new BlockingQueueAdder<Integer>(queue, number);
        
        poller.start();
        adder.start();
    }

}
