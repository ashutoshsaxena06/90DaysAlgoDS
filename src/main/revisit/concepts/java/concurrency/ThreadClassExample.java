package main.revisit.concepts.java.concurrency;

public class ThreadClassExample extends Thread{
    public static void main(String[] args) {
        ThreadClassExample t1 = new ThreadClassExample();
        ThreadClassExample t2 = new ThreadClassExample();
        t1.start();
        t2.start();

         /*
        multi threads at runtime
         */
        for (int i = 0; i < 10; i++) {
            new ThreadClassExample().start();
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(String.format("counter %s : thread %s and active thread count %s", i, Thread.currentThread().getId(), Thread.activeCount()));
        }
    }
}
