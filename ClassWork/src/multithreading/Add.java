/*
 * Clasa este un thread paralele care va aduna o unitate la un biect de tip counter
 */
package multithreading;

/**
 *
 * @author AJC
 */
public class Add extends Thread {
    
    //In memerie va veni variabila creata in contor
    private Counter counter;
    
    public Add(Counter commonCounter){
        counter = commonCounter;
    }
    
    @Override
    public void run(){
        for (int i=0; i<5000; i++){
            counter.increment();
        }
    }
}
