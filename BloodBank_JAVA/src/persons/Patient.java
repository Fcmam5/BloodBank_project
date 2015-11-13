package persons;

/**
 * Created by fcmam5 on 11/13/15.
 * Implemented by
 */
public class Patient extends Personne {
  
   private int quantite;
    private int degre_urg;
    public Patient(int quantite,int degre_urg){
        super(name, firstName, grouping,adresse[]);
        this.degre_urg=degre_urg;
        this.quantite=quantite;
    }
    public void setQuantite(int quantite){
        this.quantite=quantite;
    }
    public int getQuantite(){
        return this.quantite;
    }
    public void setDegre_urg(int degre_urg){
        this.degre_urg=degre_urg;
    }
    public int getDegre_urg(){
        return this.degre_urg;
    }
}
