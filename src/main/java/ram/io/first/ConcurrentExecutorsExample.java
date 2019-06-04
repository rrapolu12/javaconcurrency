package ram.io.first;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static ram.io.first.SampleConstants.printMe;

public class ConcurrentExecutorsExample {

    public static void main(String[] args) {

        printMe("Inside: " + Thread.currentThread().getName());

        printMe("Creating ExecutorService");
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        printMe("Creating: Runnable1");
        Runnable task1 = () -> {
            printMe("Executing Task 1 inside: " + Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException ex) {
                throw new IllegalStateException(ex);
            }
        };
        printMe("Creating: Runnable2");
        Runnable task2 = () -> {
            printMe("Executing Task 2 inside: " + Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(4);
            } catch (InterruptedException ex) {
                throw new IllegalStateException(ex);
            }
        };
        printMe("Creating: Runnable3");
        Runnable task3 = () -> {
            printMe("Executing Task 3 inside: " + Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException ex) {
                throw new IllegalStateException(ex);
            }
        };

        printMe("Submitting Runnables to Executor Service.");
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);

        printMe("Shutting Down Executor Service.");
        executorService.shutdown();
    }


}
