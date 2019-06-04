package ram.io.first;

public class SampleConstants {

    public void prints(){
    printMe("Inside: " + Thread.currentThread().getName());
    printMe("Creating ExecutorService");
    printMe("Creating: Runnable1");
    printMe("Creating: Runnable2");
    printMe("Creating: Runnable3");
    printMe("Submitting Runnables to Executor Service.");

}

    public static void printMe(String str) {
        System.out.println(str);
    }
}
