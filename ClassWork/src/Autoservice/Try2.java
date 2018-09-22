/*
 * Try 2
 */
package Autoservice;

/**
 *
 * @author AJC
 */
public class Try2 {

    /**
     * @param args the command line arguments
     */
    
    static Car[] cars = new Car[3];
         
    public static void main(String[] args) {
        cars[0]= new Car("BMW", (short) 250, Car.Color.BLACK);
        cars[0].increaseSpeed((short)(cars[0].getSpeed() +10));       
        cars[0].setRentPrice(80);
        cars[0].setSalePrice(1500);
        
        cars[1]=new Car ("Range Rover", (short)200, Car.Color.WHITE);
        cars[1].decreaseSpeed((short)(cars[0].getSpeed() -10));        
        cars[1].setRentPrice(65);
        cars[1].setSalePrice(1400);
        
        cars[2]=new Car ("Volvo", (short)180, Car.Color.GRAY);
        cars[2].decreaseSpeed((short)(cars[0].getSpeed() -10)); 
        cars[2].setRentPrice(50);
        cars[2].setSalePrice(1200);
        
        displayAutoservice();
    } 
    private static void displayAutoservice(){
        System.out.println("----------Autoservice----------");
        System.out.println();
        for(Car x : cars){
        System.out.println("Car Name: " + x.getName());
        System.out.println("Car Color: " + x.getColor());
        System.out.println("Car Speed: " + x.getSpeed());
        System.out.println("Car Sale Price: " + x.getSalePrice());
        System.out.println("Car Renting Price: " + x.getDailyRentPrice());  
        System.out.println();
        }
    }
}
