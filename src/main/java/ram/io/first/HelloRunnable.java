package ram.io.first;

public class HelloRunnable implements Runnable{
    public void run() {
        System.out.println("Hello from a Thread with Runnable");
        String[] importantInfo = {
                        "Mares eat oats",
                        "Does eat oats",
                        "Little lambs eat ivy",
                        "A kid will eat ivy too"
        };
        for (String text : importantInfo) {
            //Pause for 4 Seconds
            try {
                if(Thread.interrupted()){
                    throw new InterruptedException("Someone has interrupted the thread");
                }
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                //we have been interrupted: no more messages
                return;
            }
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        new Thread(new HelloRunnable()).start();
    }
}
