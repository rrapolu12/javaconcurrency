package ram.io.first;

public class SleepMessages {

    public static void main(String[] args) throws InterruptedException {
        String[] importantInfo = {
                        "Mares eat oats",
                        "Does eat oats",
                        "Little lambs eat ivy",
                        "A kid will eat ivy too"
        };

        for (String text : importantInfo) {
            //Pause for 4 Seconds
            Thread.sleep(4000);
            System.out.println(text);
        }
    }
}
