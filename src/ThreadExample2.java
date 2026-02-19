public class ThreadExample2 {
    public static class MyRunnable implements Runnable {
        /*
         * Second method is to implement the runnable interface
         * considered much better than extending Thread class
         */
        @Override
        public void run() {
            String name = Thread.currentThread().getName();
            System.out.println("Name : " + name);
            System.out.println("My Thread Running");
            System.out.println("My Thread Finished");
        }
    }

    public static void main(String[] args) {

        Thread thread = new Thread(new MyRunnable());
        thread.start();

        // virtual thread
        Thread thread1 = Thread.ofVirtual().unstarted(new MyRunnable());
        thread1.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
        }

    }
}
