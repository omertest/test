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
public class EigenException extends Exception{
    
    public EigenException () { }
    public EigenException (String reden) {
        super (reden);
    }

}