package ram.io.first;

import java.util.concurrent.TimeUnit;

public class SampleThread implements Runnable{

    @Override public void run() {
        System.out.println("Inside: " + this.toString() + Thread.currentThread().getName() + ", Time Taken: " + System.currentTimeMillis());
        /*try {
            TimeUnit.MICROSECONDS.sleep(2);
        } catch (InterruptedException ex) {
            throw new IllegalStateException(ex);
        }*/
    }
}
