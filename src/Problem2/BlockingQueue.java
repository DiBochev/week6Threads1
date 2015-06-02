package Problem2;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class BlockingQueue<E> implements Queue<E> {
    private LinkedList<E> list = new LinkedList<E>();       
   
    @Override
    public boolean addAll(Collection<? extends E> c) {
        for (E e : c) {
            this.add(e);
        }
        
        return true;
    }

    @Override
    public void clear() {
        this.list.clear();        
    }

    @Override
    public boolean contains(Object o) {
        return this.list.contains(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return this.list.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override
    public Iterator<E> iterator() {
        return this.list.iterator();
    }

    @Override
    public boolean remove(Object o) {
        return this.list.remove(o);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return this.list.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return this.list.retainAll(c);
    }

    @Override
    public int size() {
        return this.list.size();
    }

    @Override
    public Object[] toArray() {
        return this.list.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return this.list.toArray(a);
    }

    @Override
    public synchronized boolean add(E e) {        
        
        this.list.add(e);        
        notifyAll();
        return true;
    }

    @Override
    public E element() {
        return this.list.element();        
    }

    @Override
    public boolean offer(E e) {
        this.add(e);
        return true;
    }

    @Override
    public E peek() {
        return this.list.peek();
    }

    @Override
    public synchronized E poll() {
        while (this.list.isEmpty()) {
           
                try {
                    wait();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }                
        }
       
        return this.list.poll();
    }

    @Override
    public E remove() {
        return this.list.remove();
    }    

}
