package ram.io.first.sync;

import static ram.io.first.SampleConstants.printMe;

public class Counter {

    volatile int count = 0;

    public  void increment() {
        //printMe("Inside increment for Thread: " + Thread.currentThread().getName());
        this.count = count + 1;
    }

    public int getCount() {
        return count;
    }
}
