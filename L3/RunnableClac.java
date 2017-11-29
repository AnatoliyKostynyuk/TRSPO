package Lab3;

/**
 * Created by Nick Batist on 11/23/17.
 */
import java.text.MessageFormat;

public class RunnableClac implements Runnable {
    private boolean stop;
    private long time;
    private String name;
    private int a, b;

    public String getName() {
        return name;
    }

    public void stop() {
        this.stop = true;
    }

    public RunnableClac(int a, int b, long time, String name) {
        this.a = a;
        this.b = b;
        this.time = time;
        this.name = name;
        this.stop = false;
    }

    @Override
    public void run() {
        do {
            try {
                Thread.sleep(time);
                System.out.println("Enter \"0\" or \"1\" to stop");
                System.out.println(MessageFormat.format("{0}: {1}", name, a + b));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (!stop);
    }
}
