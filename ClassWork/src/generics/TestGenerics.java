/*
 * Java Program to Test Generics
 */
package generics;

/**
 *
 * @author AJC
 */
public class TestGenerics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create a box for integers
        GenericBox<Integer> boxForInteger = new GenericBox<>();
        boxForInteger.setContent(5);
        System.out.println("Box of Integer contains:" + boxForInteger.getContent().toString());
        
        // Create a box for sting
        GenericBox<String> boxForString = new GenericBox<>();
        boxForString.setContent("Hello Java 9 collegues!");
        System.out.println("Box of String contains: " + boxForString.getContent());
        
        // Create a box fo viezuri
        GenericBox<Viezure> boxForViezure = new GenericBox<>();
        Viezure viezurelePrim = new Viezure();
        boxForViezure.setContent(viezurelePrim);
        System.out.println("Box of Viezure contains: " + boxForViezure.getContent().getNumPicioareViezure());
    }
}
