package main.revisit.concepts.java.concurrency;

public class RunnableInterfaceExample implements Runnable {
    public static void main(String[] args) {
        /*
        example to start execution
         */
        Thread t1 = new Thread(new RunnableInterfaceExample());
        Thread t2 = new Thread(new RunnableInterfaceExample());
        t1.start();
        t2.start();

        /*
        multi threads at runtime
         */
        for (int i = 0; i < 10; i++) {
            Thread tn = new Thread(new RunnableInterfaceExample());
            tn.start();
        }
    }

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(String.format("counter %s : thread %s and active thread count %s", i, Thread.currentThread().getId(), Thread.activeCount()));
        }
    }
}
