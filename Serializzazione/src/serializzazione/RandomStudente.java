package serializzazione;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RandomStudente implements Runnable {
    private Studente s;
    private String[] nomi = {"Carlo", "Pietro", "Giuseppina", "Marco", "Eleonora"};
    private String[] cognomi = {"Rossi", "del Piero", "Monti", "Goldoni", "Bonaparte"};
    
    
    public RandomStudente() {
        
    }
    
    @Override
    public void run() {
        while (true) {
            s = new Studente(nomi[(int)(Math.random()*5)], cognomi[(int) (Math.random()*5)], (int)(Math.random()*30+1));
            System.out.println(s);
            stop();
        }
    }
    
    public void stop() {
        try {
            sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(RandomStudente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
