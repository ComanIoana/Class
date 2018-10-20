/*
 * Java Autoservice
 */
package autoservice;

/**
 *
 * @author AJC
 */
public class Autoservice {

    /**
     * @param args the command line arguments
     */
    
    static Car m1, m2, m3; 
    
    public static void main(String[] args) {
        //Create first car     
        m1 = new Car("Mercedes", (short)100, Car.Color.YELLOW);
        m1.setRentPrice(100);
        m1.setSalePrice(15000);
        m1.increaseSpeed((short)(m1.getSpeed()+10));
        //Create second car  
        m2 = new Car("Logan", (short)76, Car.Color.GRAY);
        m2.setRentPrice(50);
        m2.setSalePrice(5000);
        m2.decreaseSpeed((short)(m2.getSpeed()-10));
        //Create third car
        m3 = new Car("Renault",(short) 85, Car.Color.RED);
        m3.setRentPrice(50);
        m3.setSalePrice(5000);
        m3.setRentPrice(m3.getRentPrice()+15);
        m3.setSalePrice(m3.getSalePrice()-1200);
        
        displayAutoservice();
    }
    /**
    * Method display all information in Autoservice
    */    
    private static void displayAutoservice() {
        System.out.println("----------Autoservice--------");
        System.out.println("First Car");
        System.out.println("Car Name: " + m1.getName());
        System.out.println("Car Color: " + m1.getColor());
        System.out.println("Car Speed: " + m1.getSpeed());
        System.out.println("Car Sale Price: " + m1.getSalePrice());
        System.out.println("Car Renting Price: " + m1.getDailyRentPrice());
        System.out.println();
        System.out.println("Second Car");
        System.out.println("Car Name: " + m2.getName());
        System.out.println("Car Color: " + m2.getColor());
        System.out.println("Car Speed: " + m2.getSpeed());
        System.out.println("Car Sale Price: " + m2.getSalePrice());
        System.out.println("Car Renting Price: " + m2.getDailyRentPrice());
        System.out.println();
        System.out.println("Third Car");
        System.out.println("Car Name: " + m3.getName());
        System.out.println("Car Color: " + m3.getColor());
        System.out.println("Car Speed: " + m3.getSpeed());
        System.out.println("Car Sale Price: " + m3.getSalePrice());
        System.out.println("Car Renting Price: " + m3.getDailyRentPrice());
    }
}
