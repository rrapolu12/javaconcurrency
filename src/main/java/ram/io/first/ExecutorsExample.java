package ram.io.first;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsExample {

    public static void main(String[] args) throws InterruptedException {
        printMe("Inside: " + Thread.currentThread().getName());

        printMe("Creating Executor Service");
        ExecutorService executorService = Executors.newCachedThreadPool();
                        //.newSingleThreadExecutor();

        printMe("Creating a Runnable");
        Runnable runnable = () -> {
            printMe("Inside: " + Thread.currentThread().getName());
        };

        printMe("Submit the task specified by the runnable to ExecutorService.");
        executorService.submit(runnable);
        printMe("Shutting down the ExecutorService.");
        executorService.shutdown();
    }

    private static void printMe(String str) {
        System.out.println(str);
    }
}
