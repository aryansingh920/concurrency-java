public class ThreadExample2 {
    public static class MyRunnable implements Runnable {
        /*
        Second method is to implement the runnable interface
        considered much better than extending Thread class
         */
        @Override
        public void run() {
            System.out.println("My Thread Running");
            System.out.println("My Thread Finished");
        }
    }

    public static void main(String[] args) {

        Thread thread = new Thread(new MyRunnable());
        thread.start();

    }
}
