/*
 * Buton din care vom creea butonaele
 */
package oopcomputer;

/**
 *
 * @author AJC
 */
public class Buton {
    private Character simbol;
    private Carcasa stapana;    
    
    public Buton(Character noulSimbol, Carcasa nouaCarcasa){
        simbol = noulSimbol; 
        stapana = nouaCarcasa;
    }
    
    public Character apasa (){
        stapana.getEcran().setAfisaj(simbol.toString());
        return simbol;
    }
   
}
