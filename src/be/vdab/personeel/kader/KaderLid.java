/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.personeel.kader;
import be.vdab.personeel.Bediende;

/**
 *
 * @author omer.aldur
 */
public class KaderLid extends Bediende {

    public String functieTitel = "manager";

    public KaderLid(int personeelsNummer, String naam, double maandWedde, String functieTitel) {
        super(personeelsNummer, naam, maandWedde);
        setFunctieTitel(functieTitel);
        }

    public String getFunctieTitel() {
        return functieTitel;
    }

    public void setFunctieTitel(String functieTitel) {
        if (!(functieTitel.isEmpty())) {
            this.functieTitel = functieTitel;
        }
    }
    
    @Override
    public String toString() {
        return personeelsNummer + "\t" + naam + "\t" + maandWedde + "\t" + functieTitel;
    }
        @Override
    public double getVerloning() {
        return maandWedde;
    }

}
