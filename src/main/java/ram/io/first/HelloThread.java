package ram.io.first;

public class HelloThread extends Thread {

    @Override public void run() {
        super.run();
        System.out.println("Hello Thread from extends Thread ");
    }

    public static void main(String[] args) {

        new HelloThread().start();
    }
}
