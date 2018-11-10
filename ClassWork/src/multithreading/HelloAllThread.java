/*
 * Hello
 */
package multithreading;

/**
 *
 * @author AJC
 */
public class HelloAllThread extends Thread{
    @Override
    public void run() {
    System.out.println("Hello all!");
    }
}
