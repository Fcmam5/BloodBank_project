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
public class Medecin extends Personne{
    
    private String dateIntegration;

    public Medecin(
            int id,
            String name, 
            String firstName,
            String mail,
            String phoneNumber,
            Adresse adresse, 
            String dateIntegration
                 ) 
    {
        super(id,name, firstName, mail, phoneNumber,adresse);
        this.dateIntegration=dateIntegration;
    }

    

    /**
     * @return the dateIntegration
     */
    public String getDateIntegration() {
        return dateIntegration;
    }

    /**
     * @param dateIntegration the dateIntegration to set
     */
    public void setDateIntegration(String dateIntegration) {
        this.dateIntegration = dateIntegration;
    }
    
 
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return "id : "+ getId()+ "nom " + getName() + " prenom "+ getFirstName()+ " phone "+ getPhoneNumber()+  " Adresse " + getAdresse()+ " Date" + getDateIntegration();
    }
 
    public static void main(String[] args) {
        Medecin med;
        Adresse adr =new Adresse() ;
        String day ="france";
        String wil="cote d'azure";
        
        adr.setDayra(day);
        adr.setWilaya(wil);
        
        
        med = new Medecin(01, "TIENTI", "Neila", "tntneila@gmail.com", "0655", adr,"20/10/2015");
        System.out.println((med.toString()));
    }
    
    
    
}
