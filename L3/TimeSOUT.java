package Lab3;

/**
 * Created by Nick Batist on 11/23/17.
 */
    public class TimeSOUT implements Runnable {

        private boolean stop;
        private long time;

        public void stop() {
            this.stop = true;
        }

        public TimeSOUT(long time) {
            this.time = time;
            this.stop = false;
        }

        @Override
        public void run() {
            do {
                try {
                    System.out.println("Hello world!");
                    System.out.println("Enter \"0\" to stop");
                    Thread.sleep(time);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } while (!stop);
        }
    }


