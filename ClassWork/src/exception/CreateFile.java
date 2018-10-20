/*
 * Creating a file
 */
package exception;

import java.awt.Desktop;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.CREATE;

/**
 *
 * @author AJC
 */
public class CreateFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Indicate path
        Path p = Paths.get("C:\\Users\\ajcpa\\Desktop\\Created using Java.txt");
        File file = new File("C:\\Users\\ajcpa\\Desktop\\Created using Java.txt");
        //Create file
        try (OutputStream out = new BufferedOutputStream(
          Files.newOutputStream(p,CREATE))){  
            //Open file
            Desktop desktop = Desktop.getDesktop();
            desktop.open(file);
        } catch (RuntimeException x) {
           // In case of wrong file source
           System.out.println("RuntimeException: " + x.getMessage());
        } catch (IOException x) {
           // In case of wrong path
           System.out.println("IOException: " + x.getMessage());
        } 
    }    
}
