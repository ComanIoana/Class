/*
 * Generic Box
 */
package generics;

/**
 *
 * @author AJC
 * @param <T>
 */
public class GenericBox <T> {
    private T content; //For private insert getter and setter

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
        
}
