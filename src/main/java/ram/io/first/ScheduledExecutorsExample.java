package ram.io.first;

import java.util.concurrent.*;

import static ram.io.first.SampleConstants.printMe;

public class ScheduledExecutorsExample {

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        printMe("Creating ScheduledExecutorService....");
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

        printMe("Creating Runnable Task 1");
        Runnable task1 = new SampleThread();

        printMe("Submiting Executor Service");
        scheduledExecutorService.scheduleAtFixedRate(task1, 0, 2, TimeUnit.SECONDS);

        //printMe("Shutting down the ExecutorService.");
        //scheduledExecutorService.shutdown();

    }
}
