package Lab3;

/**
 * Created by Nick Batist on 11/23/17.
 */
    import java.util.Scanner;

    public class Main3 {
        public static void main(String[] args) {
            TimeSOUT timeSOUT = new TimeSOUT(2000);
            Thread thread = new Thread(timeSOUT);
            thread.start();
            Scanner in = new Scanner(System.in);
            if (in.nextInt() == 0) timeSOUT.stop();

            RunnableClac runnableClac = new RunnableClac(1, 5, 1000, "first");
            RunnableClac runnableClac1 = new RunnableClac(1, 8, 3000, "second");
            thread = new Thread(runnableClac);
            Thread thread1 = new Thread(runnableClac1);
            thread.start();
            thread1.start();
            if (in.nextInt() == 0) {
                runnableClac.stop();
            }
            if (in.nextInt() == 1) {
                runnableClac1.stop();
            }
        }
    }

