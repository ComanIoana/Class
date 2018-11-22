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
public class Status {
    
    boolean power ;
    
    public void powerOn(){ 
    //method for power On
        power = true;   
    }
    public void powerOff (){
    //method for power Off
        power = false;  
    }    

    public boolean getStatus() {
        return power;
    }
}
