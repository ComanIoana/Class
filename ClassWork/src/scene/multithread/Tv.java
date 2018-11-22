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
public class Tv {
    Status status = new Status();
    private int channel = 1;
    private int volume = 5;

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public void changeChannel (int newValue){
        //method to change the channel 
        if (status.getStatus() == true)
        channel = newValue; 
    }
    public void changeVolume (int newValue){ 
    //method to change the volume 
        if (status.getStatus() == true)
        volume = newValue;
        }
}
