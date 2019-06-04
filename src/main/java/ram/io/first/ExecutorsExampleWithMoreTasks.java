package ram.io.first;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static ram.io.first.SampleConstants.printMe;

public class ExecutorsExampleWithMoreTasks {

    public static void main(String[] args) {

        printMe("Inside: " + Thread.currentThread().getName());

        printMe("Creating ExecutorService");
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        printMe("Creating: Runnable1");

        List<SampleThread> threadList = Arrays.asList(
                        new SampleThread(),
                        new SampleThread(),
                        new SampleThread(),
                        new SampleThread(),
                        new SampleThread(),
                        new SampleThread(),
                        new SampleThread(),
                        new SampleThread()
        );

        printMe("Submitting Runnables to Executor Service.");

        for (SampleThread sampleThread : threadList) {
            executorService.submit(sampleThread);
        }
        printMe("Shutting Down Executor Service.");
        executorService.shutdownNow();
    }


}
