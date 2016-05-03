/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab;

/**
 *
 * @author omer.aldur
 */

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;


public class ZusterBedrijf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        // buffered input streams gebruiken om te lezen vanaf file
        // IOException toevoegen
             
        try( FileInputStream fis = new FileInputStream ("D:/JPF/test/bestand.obj");
               ObjectInputstream ois = new ObjectInputStream(fis);)  {
            for 
        }
               
    }
    
}
