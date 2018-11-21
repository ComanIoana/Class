/*
 * Defining an instance to be used in the program opening multiple instances
 */
package multithreading;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AJC
 */
public class NotepadInstance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String numberOfParameters = args[0];
        int numberOfParam = Integer.parseInt(numberOfParameters);
        try (FileWriter fw = new FileWriter("C:\\Users\\ajcpa\\Desktop\\Instance3.txt",false)){
            for(int param=1;param <= numberOfParam;param++){
                fw.append("Hello " + args[param] + "\r\n");
                Map<String, String> env = System.getenv();
                String no = env.get("INSTANCE_NO");
                fw.append("This is instance " + no + "\r\n");
            }
            File file = new File ("C:\\Users\\ajcpa\\Desktop\\Instance3.txt");
            Desktop desktop = Desktop.getDesktop();
            desktop.open(file);
        }catch (IOException ex) {
            Logger.getLogger(NotepadInstance.class.getName()).log(Level.SEVERE, "File could not be open", ex);
        }
    }
}
