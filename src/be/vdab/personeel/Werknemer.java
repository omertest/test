/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.personeel;

import java.lang.Comparable;

/**
 *
 * @author omer.aldur
 */
public abstract class Werknemer implements Comparable<Werknemer> {

    public int personeelsNummer = -1;
    public String naam = "nog niet ingevuld";

    public Werknemer() {
    }

    public Werknemer(int personeelsNummer, String naam) {
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

    public String getNaam() {
        return naam;
    }

    public final void setNaam(String naam) {
        if (naam != null) {
            this.naam = naam;
        }
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
