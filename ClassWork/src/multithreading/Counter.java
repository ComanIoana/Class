/*
 * Obiectul partajat de cele 2 threauri
 */
package multithreading;

/**
 *
 * @author AJC
 */
public class Counter {
    
    private volatile double value = 0.0;
    
    /**
     * Metoda incremeteaza valoarea
     */
    
    public synchronized void increment() {
    value++;
    }
    /**
     * Metoda decremeteaza valoarea
     */
    
    public synchronized void decrement() {
    value--;
    }
    public synchronized double getValue() {
    return value;
    }
}
