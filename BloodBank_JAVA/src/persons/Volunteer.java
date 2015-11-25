package persons;

/**
 * Created by fcmam5 on 11/13/15.
 * Implemented by  nourelhouda31
 */
public class Volunteer extends Personne {

     private double poids ;
     private byte physical_cond_rate; // Scale on 5 (Format: x/5)
     public String mail;
     public int numTel;

    public Volunteer(int age, double poids, byte physical_cond_rate, String name, String firstName, String grouping, String adresse[],String mail, int numTel) {
        super(name, firstName, age,grouping, adresse);
        this.poids = poids;
        this.physical_cond_rate = physical_cond_rate;
        this.mail=mail;
        this.numTel=numTel;
    }

    
    public double getPoids() {
        return poids;
    }
     public void setPoids(double poids) {
        this.poids = poids;
    }

    public byte getPhysical_cond_rate() {
        return physical_cond_rate;
    }

    public void setPhysical_cond_rate(byte physical_cond_rate) {
        this.physical_cond_rate = physical_cond_rate;
    }
     
   
     }
     
