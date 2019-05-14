package ram.io.first;

public class HelloRunnable implements Runnable{
    public void run() {
        System.out.println("Hello from a Thread with Runnable");
    }

    public static void main(String[] args) {
        new Thread(new HelloRunnable()).start();
    }
}
