/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Autoservice;

/**
 *
 * @author AJC
 */
public class AutoserviceTry2 {

    /**
     * @param args the command line arguments
     */
    
     static Car carsArray[] = new Car[3];
    
    public static void main(String[] args) {
        carsArray[0] = new Car(0);
        carsArray[0].setName("BMW");
        carsArray[0].setColor(Car.Color.BLACK);
        carsArray[0].setSpeed(250);
        carsArray[0].increaseSpeed(10);       
        
        carsArray[1] = new Car(1);s
        carsArray[1].setName("Range Rover");
        carsArray[1].setColor(Car.Color.WHITE);
        carsArray[1].setSpeed(200);
        carsArray[1].decreaseSpeed(10);        
        
        carsArray[2] = new Car(2);
        carsArray[2].setName("Volvo");        
        carsArray[2].setColor(Car.Color.GREY);
        carsArray[2].setSpeed(180);
        carsArray[2].increaseDailyRentPrice(15);
        carsArray[2].decreaseSalePrice(1200);
        
        displayAutoservice();
    } 
    private static void displayAutoservice(){
        for(Car x : carsArray){
        System.out.println("Car Name: " + x.getName());
        System.out.println("Car Color: " + x.getColor());
        System.out.println("Car Speed: " + x.getSpeed());
        System.out.println("Car Sale Price: " + x.getSalePrice());
        System.out.println("Car Renting Price: " + x.getDailyRentPrice());  
        System.out.println();
        }
    }
}
