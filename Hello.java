import java.util.concurrent.TimeUnit;

public class Hello {
    public static void main(String[] args) {
        int max = Integer.parseInt(System.getenv("MAX"));
        int i = 0;
        while (i < max) {
            System.out.printf("Spawning thread %d\n", i);
            new Thread(() -> {
                try {
                    TimeUnit.HOURS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
            i++;
        }
    }
}