/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.util;


/**
 *
 * @author omer.aldur
 */
public class Datum implements IDatum, Comparable <Datum> {

    private int dag = 1;
    private int maand = 1;
    private int jaar = 1584;
    private boolean schrikkelJaar;
    private boolean isFebruari;

    public Datum() {
    }

    public Datum(int dag, int maand, int jaar) {
        setDag(dag);
        setMaand(maand);
        setJaar(jaar);
    }
    
    
    @Override
    public void setJaar(int jaar) {
        if (jaar >= 1584 && jaar < 4100);
        {
            this.jaar = jaar;
        }
        if (jaar % 4 == 0) {
            if ((jaar % 100 != 0) || (jaar % 400 == 0)) {
                schrikkelJaar = true;
            }
        }
    }
    public int getJaar() {
        return jaar;
    }

    @Override
    public void setMaand(int maand) {
        if (maand > 0 && maand < 13) {
            this.maand = maand;
        }
        if (maand == 2) {
            isFebruari = true;
        }
    }

    public int getMaand() {
        return maand;
    }

    public int getDag() {
        return dag;
    }

    @Override
    public void setDag(int dag) {
        if ((isFebruari = true) && (schrikkelJaar = false)) {
            if (dag < 29) {
                this.dag = dag;
            }
        }
        if ((isFebruari = true) && (schrikkelJaar = true)) {
            if (dag < 30) {
                this.dag = dag;
            }
        }
    }
    @Override
    public void setDatum(int dag, int maand, int jaar) {
        setDag(dag);
        setMaand(maand);
        setJaar(jaar);
    }

    @Override
    public String toString() {
        return ("\t" + dag + "\\" + maand +  "\\" + jaar);
    }   

    @Override
    public int compareTo(Datum o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
