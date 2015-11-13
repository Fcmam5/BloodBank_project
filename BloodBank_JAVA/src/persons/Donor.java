package persons;

/**
 * Created by fcmam5 on 11/13/15.
 * Implemented by
 */
public class Donor extends Personne {
   private char groupage;
    private int n;
    private int quantite;
   // private char adresse; normalement makanch
    //private bool motivation ; hadi fct 
    public donor(char groupage , int n, int quantite,char adresse, bool motivation){
        super (name, firstName, grouping,adresse[]);
                this.groupage=groupage;
                 this.n=n;
                  this.quantite=quantite;
                  this.adresse=adresse;
    } // sagmih ki stagmi les atribus taw3ek ok
   
    public void setGroupage (char gropage){
        this.groupage=groupage;
        
}
    public char getGroupage(){
        return this.groupage:
}
    public void setN (int n){
        this.n=n;
    
    }
    public int getN( ){
        return this.n;
       
    }
public void setQuantite (int quantite){
    this.quantite=quantite;
}
public int getQuantite (){
    return this.quantite;
    
}
public void setAdresse (char adresse){
    this.adresse=adresse; // hadi makanch
}
public char getAdresse (){
    return this.adresse; // hadi makanch 
    
}
public void setMotivation( bool motivation){
    this.motivation=motivation;
}
public bool getMotivation (){
    return this.motivation;
 
/* wal motivation tji fct 
je c po fal corp ta3ha cha yji dsl */

}     
}
