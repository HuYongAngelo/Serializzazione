package serializzazione;

import java.io.Serializable;

public class Studente implements Serializable {
    private String nome;
    private String cognome;
    private Integer numeroRegistro;

    public Studente(String nome, String cognome, Integer numeroRegistro) {
        this.nome = nome;
        this.cognome = cognome;
        this.numeroRegistro = numeroRegistro;
    }
    
    @Override
    public String toString() {
        return "Studente: "+numeroRegistro+", Nome: "+nome+", Cognome: "+cognome+";";
    }
}
