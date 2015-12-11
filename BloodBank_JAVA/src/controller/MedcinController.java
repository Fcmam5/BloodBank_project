package controller;

/**
* Created by nourelhouda
* Implemented by nourelhouda & Fcmam5
*/
public class MedcinController {

    public void ajouterDoneur(/*les info de dialog*/) {
        // base de donnée : ajouter donor
}

    public boolean verifierAge(int Age){
        return ((age <18)&&(age>=65));
          }


    public boolean verPoids(int poids){
        return poids>=50;
    }

    public boolean isValideName(String name){
      //Contains letters only !
      return name.matches("[a-zA-Z]+");
    }

    //Need : Date du dernier don
}
