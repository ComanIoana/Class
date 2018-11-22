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
public class Man {
    
    VacuumCleaner evac = new VacuumCleaner();
    Woman wife = new Woman();
    
    public void vacuuming(){
        evac.powerOn();
    }
    
    public void wakeWife(){
        wife.setSleeping(false); 
    }
    
}
