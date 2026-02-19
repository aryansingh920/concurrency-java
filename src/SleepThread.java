public class SleepThread {
    public static void main(String[] args) {
        @SuppressWarnings("CallToPrintStackTrace")
        Runnable runnable = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.printf("Thread Name : %s\n", threadName);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Prints after thread wakes");
        };

        Thread thread = new Thread(runnable, "The Thread");
        thread.start();
    }

}
