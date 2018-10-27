/*
 * See all figures printed
 */
package tdd;

import java.util.LinkedList;

/**
 *
 * @author AJC
 */
public class TestFigures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Dreptunghi d1 = new Dreptunghi();
        Dreptunghi d2 = new Dreptunghi();
        Cerc c = new Cerc();
        Patrat p = new Patrat();
        Triunghi t1 = new Triunghi();
        Triunghi t2 = new Triunghi();
        
        //Creeam o colectie de date si incarcam in ea obiectele de mai sus
        LinkedList <FiguraGeometrica> ListaFiguri = new LinkedList();
        ListaFiguri.add(d1);
        ListaFiguri.add(d2);
        ListaFiguri.add(c);
        ListaFiguri.add(p);
        ListaFiguri.add(t1);
        ListaFiguri.add(t2);
        
        //Parcurgem lista si listam figurile
        ListaFiguri.forEach((t) -> {
            System.out.println (t.getDefinition());
        });
        
        Cerc circle = new Cerc();
        Dreptunghi rectangle = new Dreptunghi();
        Patrat square = new Patrat();
        Triunghi triangle = new Triunghi();
        
        System.out.println ("\nList of Geometric Figures\n");
        System.out.println (circle.getDefinition());
        System.out.println (rectangle.getDefinition());
        System.out.println (square.getDefinition());
        System.out.println (triangle.getDefinition() + "\n");
    }
    
}
