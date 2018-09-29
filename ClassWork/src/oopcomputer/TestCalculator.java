/*
 * Testing calculator
 */
package oopcomputer;

import java.util.Scanner;

/**
 *
 * @author AJC
 */
public class TestCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creeaza un calculator
        Carcasa calculator = new Carcasa();
        // Apasam butoane pana apare un operator
        calculator.buton1.apasa();
        calculator.buton2.apasa();
        calculator.buton3.apasa();
        calculator.butonPlus.apasa();
        calculator.buton3.apasa();
        calculator.buton2.apasa();
        calculator.buton1.apasa();
        // Apasam butoane pana apare egal
        calculator.butonEgal.apasa();
        // Afisam rezultatul
        
    }
    
}
