package javaLang;
public class ThreadExample3 {

    /*
     * Third method is to implement the Runnable interface
     * as an anonymous class
     * Fourth way is to do the same with lambda expression
     */

    public static void main(String[] args) {
        Runnable runnable = () -> {
            String name = Thread.currentThread().getName();
            System.out.println("name print inside thread : " + name);
            System.out.println("Runnable running");
            System.out.println("Runnable finished");
        };

        Thread thread = new Thread(runnable, "Thread 1");
        String name = Thread.currentThread().getName();
        System.out.println("name : " + name);
        thread.start();

        Thread thread2 = new Thread(runnable, "Thread 2");
        String name2 = Thread.currentThread().getName();
        System.out.println("name 2 : " + name2);
        thread2.start();

    }
}
