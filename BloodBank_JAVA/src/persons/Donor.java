package persons;

import java.util.Objects;

/**
 * Created by fcmam5 on 11/13/15.
 * Implemented by Mouilah-Sarra
 */
public class Donor extends Personne {
   
    private int quantite;
    private byte motivation;
   /* private Object donorCard[] = new Object[3];// [[int DonorKey]|[String email]|[int telNumber]] //base de donnée ! pas besoin de ce tableau */
 

    public Donor(int id, String name, String firstName, int age, String grouping, String[] adresse, int quantite, boolean motivation,String mail, int numTel) {
        super(id,name, firstName, age, grouping, adresse);
     
        this.quantite = quantite;
        this.motivation = motivation;
         
    }


    public void setGroupage (String gropage){
        this.groupage=groupage;
        
}
    public String getGroupage(){
        return getGrouping();
}

   

    // HOw much he gives ?
    public void setQuantite (int quantite){
    this.quantite=quantite;
}

    public int getQuantite (){
        return this.quantite;
    }
    
    public void setMotivation(byte motivation){
        this.motivation=motivation;
    }
    public byte getMotivation(){
        return this.motivation ;
    }


    /**
     *  if He is motivated let's keep his infos in a table :
     *  [[String DonorKey]|[String email]|[int telNumber]]
     *  DonorKey is [firstDon+the name & first's first nameLetter]
     *      Example : "Johny Bob's first donNum was 54 (Was the the 54th donor)"
     *                 His code will be : JB54
     */

    /*public Donor(String name, String firstName, int age, String grouping, String[] adresse_given, int quantite) {
        super(name, firstName, age, grouping, adresse_given);
        this.quantite = quantite;
        this.motivation = true;

        //Filling DonorCard :
        this.donorCard[0] = name.charAt(0)+firstName.charAt(0)+this.getDonNum(); //Code B-)
        this.donorCard[1] = name;
        this.donorCard[2] = firstName;
    }*/

}

