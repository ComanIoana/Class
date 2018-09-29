/*
 * Buton din care vom creea butonaele
 */
package oopcomputer;

/**
 *
 * @author AJC
 */
public class Buton {
    private Character simbol;
    
    public Buton(Character noulSimbol){
        simbol = noulSimbol;
        // Constructorul are acelasi nume cu clasa
    }
    
    public Character apasa (){
        System.out.println();
        return simbol;
    }
    
}
