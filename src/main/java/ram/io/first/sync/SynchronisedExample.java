package ram.io.first.sync;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static ram.io.first.SampleConstants.printMe;

public class SynchronisedExample {

    public static void main(String[] args) throws InterruptedException {

        printMe("Inside: " + Thread.currentThread().getName());

        printMe("Creating Executor Service.");
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        printMe("Creating Counter");
        SynchronisedCounter counter = new SynchronisedCounter();

        printMe("Loop and submit Tasks");

        for (int i = 0; i < 1000; i++) {
            executorService.submit(counter::increment);
        }
        printMe("Executor Service Shutdown.");
        executorService.shutdown();
        printMe("Await Termination...");
        executorService.awaitTermination(60, TimeUnit.SECONDS);

        printMe("Final Count is : " + counter.getCount());

    }
}
