package persons;

/**
 * Created by fcmam5 on 11/13/15.
 * Implemented by
 */
public class Donor extends Personne {
   private char groupage;
    private int n;
    private int quantite;
    private char adresse;
    private bool motivation ;
    public donor(char groupage , int n, int quantite,char adresse, bool motivation){
        super (name, firstName, grouping,adresse[]);
                this.groupage=groupage;
                 this.n=n;
                  this.quantite=quantite;
                  this.adresse=adresse;
    }
   
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
    this.adresse=adresse;
}
public char getAdresse (){
    return this.adresse;
    
}
public void setMotivation( bool motivation){
    this.motivation=motivation;
}
public bool getMotivation (){
    return this.motivation;
}
     
}
