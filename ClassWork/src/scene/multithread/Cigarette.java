/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scene.multithread;

/**
 *
 * @author AJC
 */
public class Cigarette {
    private int lenght = 0;
    private boolean smoke = false;
    
    public Cigarette (int newLenght){
        lenght = newLenght;
    }
    
    public void burning(){   
        for(int min = 0; min <=9 ; min++){
            lenght--;
            if (lenght > 0) {
                smoke = true;
            }else{
                smoke = false;
            }    
        }
    }

    public boolean isSmoke() {
        return smoke;
    }
    
    public int getValue(){
        return lenght;
    }
}
