package persons;

/**
 * Created by fcmam5 on 11/13/15.
 * Implemented by nesrinehanane
 */
abstract class Personne {
    private String name;
    private String firstName;
    private String grouping;
    private int age;
    private String adresse[] = new String[2]; // [ "Wilaya" || "Daira"]


    public Personne(String name, String firstName, int age, String grouping , String adresse_given[]){
        this.grouping=grouping;
        this.name=name;
        this.firstName=firstName;
        this.age = age;
        /**
         * adresse_given[0] should be "Wilaya"
         * adresse_given[1] should be "Daira"
         */
        this.adresse[0]=adresse_given[0];
        this.adresse[1]=adresse_given[1];

    }

    /*this one is for the doctor and the admin */
    public Personne(String name, String firstName){
        this.name=name;
        this.firstName=firstName;
    }


    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public void setGrouping(String grouping){
        this.grouping=grouping;
    }
    public String getGrouping(){
        return this.grouping;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getAdresse() {
        return adresse;
    }

    public void setAdresse(String[] adresse) {
        this.adresse = adresse;
    }
}
