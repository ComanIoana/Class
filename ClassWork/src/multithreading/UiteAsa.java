/*
 * Lanseaza threaduri
 */
package multithreading;

/**
 *
 * @author AJC
 */
public class UiteAsa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread tha = new HelloAllThread();
        Thread thw = new HelloWorldThread();
        System.out.println("Priority of the thread thw: " + thw.getPriority());
        System.out.println("Priority of the thread tha: " + tha.getPriority());
        tha.setPriority(Thread.MIN_PRIORITY);
        thw.setPriority(Thread.MAX_PRIORITY);
        tha.start();
        thw.start();
    }
}
