/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.personeel;

/**
 *
 * @author omer.aldur
 */
public class Bediende extends Werknemer {

    public double maandWedde = 1129.47D;

    public Bediende() {
    }

    public Bediende(int personeelsNummer, String naam, double maandWedde) {
        super(personeelsNummer, naam);
        setMaandWedde(maandWedde);
    }

    public double getMaandWedde() {
        return maandWedde;
    }

    public final void setMaandWedde(double maandWedde) {
        if (maandWedde >= 0) {
            this.maandWedde = maandWedde;
        }
    }

    @Override
    public int compareTo(Werknemer o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public double getVerloning() {
        return maandWedde;
    }

}
