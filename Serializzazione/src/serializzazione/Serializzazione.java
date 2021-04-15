package serializzazione;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Serializzazione {

    public static void main(String[] args) {
        Studente s = new Studente("Nome", "Cognome", 20);
        
        try {
            FileOutputStream fos = new FileOutputStream("test.ser");
            
    //      Serve per scrivere nello Stream
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(9);
            oos.writeObject("Ciao");
            oos.writeFloat((float)0.345);
            
            oos.flush();
            oos.close();
            fos.close();
            
            FileInputStream fis = new FileInputStream("test.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            int valore1 = (int) ois.readObject();
            String valore2 = (String) ois.readObject();
            float valore3 = (float) ois.readObject();
            System.out.println("Valore 1: " + valore1);
            System.out.println("Valore 2: " + valore2);
            System.out.println("Valore 3: " + valore3);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Serializzazione.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Serializzazione.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Serializzazione.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}