package ram.io.first;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static ram.io.first.SampleConstants.printMe;

public class CancelFuture {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        printMe("Creating Executor Servce.");
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        long startTime = System.nanoTime();
        printMe("Creating Future from ExecutorService Submit");
        Future<String> future = executorService.submit(() -> {
            Thread.sleep(2000);
            return "Hello from Callable";
        });

        printMe("Checking if Future is done");
        if(! future.isDone()){
            printMe("Task is still not Done.");
            Thread.sleep(2000);
            printMe("After Sleep.....");
            double elapsedTime = (System.nanoTime() - startTime) / 1000000000.0;
            if(elapsedTime > 1){
                printMe("Canceling Future...!");
                future.cancel(true);
                printMe("Future Successfully cancelled.");
            }
        }
        printMe("Checking is Future is Cancelled....");
        if(! future.isCancelled()){
            printMe("Task Completed! Retrieving the result.");
            String result = future.get();
            printMe("Result: " + result);
        }else {
            printMe("Future Cancelled......");
        }
        executorService.shutdown();
    }
}
