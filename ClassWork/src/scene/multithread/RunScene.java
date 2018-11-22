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
public class RunScene {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.status.powerOn();
        System.out.println(tv.status.getStatus());
        
        tv.setVolume(10);
        System.out.println(tv.getVolume());
        
        tv.setChannel(8);
        System.out.println(tv.getChannel());
        Cigarette cigarre = new Cigarette(10);
        try{
            cigarre.burning();
            System.out.println(cigarre.getValue());
            System.out.println(cigarre.isSmoke());
        }catch(java.lang.IllegalThreadStateException e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
