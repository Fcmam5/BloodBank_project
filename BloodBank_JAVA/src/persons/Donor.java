package persons;

/**
 * Created by fcmam5 on 11/13/15.
 * Implemented by
 */
public class Donor extends Personne {
    private static int donNum = 0;
    private int quantite;
    boolean motivation;

    public Donor(String name, String firstName, int age, String grouping, String[] adresse, int quantite, boolean motivation) {
        super(name, firstName, age, grouping, adresse);
        this.donNum++;
        this.quantite = quantite;
        this.motivation = motivation;
    }


    public void setGroupage (String gropage){
        setGrouping(gropage);
        
}
    public String getGroupage(){
        return getGrouping();
}

    public int getDonNum( ){
        return this.donNum;
       
    }

    // HOw much he gives ?
    public void setQuantite (int quantite){
    this.quantite=quantite;
}

    public int getQuantite (){
        return this.quantite;
    }


}     

