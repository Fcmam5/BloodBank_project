package persons;

/**
 * Created by fcmam5 on 11/13/15.
 * Implemented by
 */
public class Patient extends Personne {
  
   private int quantite;
    private int degre_urg; //Scale on 10 ex (xx/10)

    public Patient(int quantite,byte degre_urg,String adresse[],String grouping, String name,String firstName,int age){
        super(name, firstName, age, grouping, adresse);
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
