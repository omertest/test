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
public class ExceptionVoorWerknemer extends Exception{

    public ExceptionVoorWerknemer() {
    }
    

    public ExceptionVoorWerknemer (String reden) {
        super(reden);
    }
}