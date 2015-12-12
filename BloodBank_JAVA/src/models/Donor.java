/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.swing.JRadioButton;

/**
 *
 * @author TOSHIBA
 */
public class Donor extends Personne{
    private int quantite;
    private byte motivation;

    public Donor(int id, String name, String firstName, int age, String grouping, Adresse adresse, String mail, String phoneNumber, double poids, int quatite, byte motivation) {
        super(id, name, firstName, age, grouping, adresse, mail, phoneNumber, poids);
        this.quantite=quatite;
        this.motivation=motivation;
       
}

    

    /**
     * @return the quantite
     */
    public int getQuantite() {
        return quantite;
    }

    /**
     * @param quantite the quantite to set
     */
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    /**
     * @return the motivation
     */
    public byte getMotivation() {
        return motivation;
    }

    /**
     * @param motivation the motivation to set
     */
    public void setMotivation(byte motivation) {
        this.motivation = motivation;
    }



}
