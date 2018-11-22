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
public class Woman {
    Tv tv = new Tv();
    Cigarette cigar = new Cigarette(10);
    
    private boolean sleeping;
    private boolean watchingTv;
    
    public void isSomking(){
        cigar.burning();
    }

    public boolean isSleeping() {
        return sleeping;
    }

    public void setSleeping(boolean sleeping) {
        this.sleeping = sleeping;
    }


    public boolean isWatchingTv() {
        return watchingTv;
    }

    public void setWatchingTv(boolean watchingTv) {
        this.watchingTv = watchingTv;
    }

}
