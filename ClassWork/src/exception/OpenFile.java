/*
 * Try to open a file
 */
package exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author AJC
 */
public class OpenFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    BufferedReader r;
        try {
            r = new BufferedReader(new FileReader("C:\\Users\\ajcpa\\Desktop\\text.txt"));
            try {
            String firstLine = r.readLine();
             System.out.println("Am citit din fisier: " + firstLine);
            } catch (IOException ex) {
            //Logger.getLogger(OpenFile.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Exceptionn has the message: " + ex.getMessage());
            }  finally {
                try {
                    r.close();
                } catch (IOException ex) {
                    //Logger.getLogger(OpenFile.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("Exceptionn has the message: " + ex.getMessage());
                }
            }
            
        }   catch (FileNotFoundException ex){
             System.out.println("Exceptionn has the message: " + ex.getMessage());
        }
    }    
}
