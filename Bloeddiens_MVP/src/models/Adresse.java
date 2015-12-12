/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author TOSHIBA
 */
public class Adresse {
    private String wilaya ;
    private String dayra ; 
    
    public Adresse(String wilaya, String dayra) {
        this.wilaya = wilaya;
        this.dayra = dayra;
    }

   public Adresse() {
        
    }

    public String getWilaya() {
        return wilaya;
    }

    public String getDayra() {
        return dayra;
    }

    public void setWilaya(String wilaya) {
        this.wilaya = wilaya;
    }

    public void setDayra(String dayra) {
        this.dayra = dayra;
    }
    
    
    
    @Override
    public String toString(){
    return "dayra: "+ getDayra()+ "  wilaya : "+ getWilaya();
    
}
}
