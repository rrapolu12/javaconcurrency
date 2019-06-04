package ram.io.first.sync;

public class SynchronisedCounter {

    volatile int count = 0;

    public synchronized void increment() {
        //printMe("Inside increment for Thread: " + Thread.currentThread().getName());
        this.count = count + 1;
    }

    public int getCount() {
        return count;
    }
}
