/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.personeel;

import be.vdab.util.ExceptionVoorWerknemer;
import java.lang.Comparable;

/**
 *
 * @author omer.aldur
 */
public abstract class Werknemer implements Comparable<Werknemer> {

    public int personeelsNummer;
    public String naam;

    public Werknemer() {this.personeelsNummer=(-1); this.naam = ("nog niet ingevuld");
    }

    public Werknemer(int personeelsNummer, String naam) throws ExceptionVoorWerknemer {
        setPersoneelsNummer(personeelsNummer);
        setNaam(naam);
    }  

    public int getPersoneelsNummer() {
        return personeelsNummer;
    }

    public void setPersoneelsNummer(int personeelsNummer) {
        if (personeelsNummer >= 0) {
            this.personeelsNummer = personeelsNummer;
        }
    }

    public final void setNaam(String naam) {
        if (naam != null) {
            this.naam = naam;
        }
    }
    
        public String getNaam() {
        return naam;
    }

    public abstract double getVerloning();

    @Override
    public String toString() {
        return personeelsNummer + "\t" + naam;
    }

    @Override
    public abstract int compareTo(Werknemer naam);
    { // equals to methode gebruiken 
    }

//    nog de try and catch block invoegen  
}
