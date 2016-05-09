/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.personeel;

import be.vdab.util.ExceptionVoorWerknemer;

/**
 *
 * @author omer.aldur
 */
public class Arbeider extends Werknemer {

    private float uurLoon = 9.76F;

    public Arbeider() {
    }

    public Arbeider(int personeelsNummer, String naam, float uurloon) throws ExceptionVoorWerknemer {
        super(personeelsNummer, naam);
        setUurLoon(uurloon);
    }

    public float getUurLoon() {
        return uurLoon;
    }

    public void setUurLoon(float uurloon) {
        if (uurloon >= 0) {
        this.uurLoon = uurLoon;
        }
    }
    
    @Override
    public String toString() {
        return personeelsNummer + "\t" + naam + "\t" + uurLoon;
    }

    @Override
    public int compareTo(Werknemer o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public double getVerloning() {
    return (uurLoon * 7.6 * 65)/3 ; 
}

}

