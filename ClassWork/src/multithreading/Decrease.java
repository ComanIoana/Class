/*
 * Un thread paralel care va scadea o unitate din contor
 */
package multithreading;

/**
 *
 * @author AJC
 */
public class Decrease extends Thread{
    
    private Counter counter;
    
    public Decrease(Counter commonCounter){
        counter = commonCounter;
    }
    
    @Override
    public void run(){
        for (int i=0; i<5000; i++){
            counter.decrement();
        }
    }
}
