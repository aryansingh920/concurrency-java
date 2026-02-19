public class ThreadExample3 {

    /*
     Third method is to implement the Runnable interface
     as an anonymous class
     */

    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Runnable running");
            System.out.println("Runnable finished");
        };

        Thread thread = new Thread(runnable);
        thread.start();


    }
}
