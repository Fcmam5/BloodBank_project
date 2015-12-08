import java.util.Date;

/**
 ** Created  on 12/05/15.
 * Implemented by nesrinehanane
 * */
 public class Medecin extends Personne{
    
   public class Medecin extends Personne{
    
    private String dateIntegration;

    public Medecin(int id,String name, String firstName,String mail,int phoneNumber,Adresse adresse, String dateIntegration) {
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
}
