package persons;

/**
 * Created by fcmam5 on 11/13/15.
 * Implemented by
 */
public class Volunteer extends Personne {
  
     
     private int age ;
     private double poids ;
     private int physical_cond_scale ;

    public Volunteer(int age, double poids, String name, String firstName, char grouping) {
        super(name, firstName, grouping);
        this.age = age;
        this.poids = poids;
    }
     

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    
    public double getPoids() {
        return poids;
    }
     public void setPoids(double poids) {
        this.poids = poids;
    }

    public int getPhysical_cond_scale() {
        return physical_cond_scale;
    }

    public void setPhysical_cond_scale(int physical_cond_scale) {
        this.physical_cond_scale = physical_cond_scale;
    }
     
   
     }

