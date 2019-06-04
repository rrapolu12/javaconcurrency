package ram.io.first;

import java.util.concurrent.*;

import static ram.io.first.SampleConstants.printMe;

public class CallableExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        printMe("Inside: " + Thread.currentThread().getName());

        printMe("Creating ExecutorService");
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        printMe("Creating: Callable");

        Callable<String> callable = ()->{

            printMe("Entered Callable");
            Thread.sleep(2000);
            return "Hello From Callable";
        };
        printMe("Submitting Runnables to Executor Service.");
        Future<String> future = executorService.submit(callable);

        //This will execute immediately
        if(!future.isDone()){
            printMe("Task is still not Done.");
            Thread.sleep(2000);
        }

        printMe("Do something while the callable is getting executed.");

        printMe("Retrieve the Result from Future.");
        String result = future.get();
        printMe(result);

        executorService.shutdownNow();


    }
}
