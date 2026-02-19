public class ThreadExample1 {
    public static class MyThread extends Thread {
        /*
        First Method is to implement a subclass of the Thread class
        and override the run method 
         */
        @Override
        public void run() {
            System.out.println("My Thread Running");
            System.out.println("My Thread Finished");
        }
    }
    public static void main(String[] args) {
        
        MyThread myThread = new MyThread();
        myThread.start();

    }
}
