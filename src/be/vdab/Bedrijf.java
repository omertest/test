/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab;

import be.vdab.personeel.Arbeider;
import be.vdab.personeel.Bediende;
import be.vdab.personeel.Werknemer;
import java.util.Set;
import be.vdab.personeel.kader.KaderLid;
import java.io.Serializable;
import java.util.HashSet;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author omer.aldur
 */
public class Bedrijf implements Serializable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        Set<Werknemer> set = new HashSet<>();
        set.add(new Arbeider(1, "Carla", 11.25F));
        set.add(new Bediende(2, "Els", 1535.68));
        set.add(new Arbeider(3, "Ann", 13.45F));
        set.add(new Bediende(4, "Denise", 1610.32));
        set.add(new KaderLid(5, "Brenda", 2120.50, "chef"));

        for (Werknemer werker : set) {
            System.out.println(werker);
        }

        try (
                FileOutputStream fos = new FileOutputStream("D:/JPF/test/bestand.obj");
                ObjectOutputStream oos = new ObjectOutputStream(fos);)  {
            for (Werknemer werker : set) {
                oos.writeObject(werker);
            }
        }catch (IOException ex) {
            System.out.println("file kon uitzonderlijk niet gemaakt worden");
        }
    }
}
