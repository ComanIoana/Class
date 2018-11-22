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
public class VacuumCleaner extends Status{
    Status status = new Status();
    private boolean motor;
    private boolean fan;
    
    @Override
    public void powerOn (){
            motor = true;
            fan = true;
        }
    @Override
    public void powerOff(){
            motor = false;
            fan = false;
    }
}
