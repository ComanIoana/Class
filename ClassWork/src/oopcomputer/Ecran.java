/*
 * Ecranul calculatorului
 */
package oopcomputer;

/**
 *
 * @author AJC
 */
public class Ecran {
    private String afisaj = "0";
    public String getAfisaj() {
        return afisaj;
    }

    public void setAfisaj(String afisaj) {
        //Vizibilitate afisaj in consola
        System.out.println(afisaj);
        this.afisaj = afisaj;
    }
}