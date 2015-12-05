package persons;

/**
 * Created by fcmam5 on 11/13/15.
 * Implemented by nesrinehanane
 */
 public class Personne {
  private int id;
    private String name;
    private String firstName;
    private String grouping; //on peut 'enlever mais au cas ou le med est un donneur'
    private int age;
    private String adresse[] = new String[2]; // [ "Wilaya" || "Daira"]
    private String mail;
    private int phoneNumber;
    


    public Personne(char id, String name, String firstName, int age, String grouping , String adresse_given[],String mail, int phoneNumber){
        this.id=id;
        this.grouping=grouping;
        this.name=name;
        this.firstName=firstName;
        this.age = age;
        this.mail=mail;
        this.phoneNumber=phoneNumber;
        /**
         * adresse_given[0] should be "Wilaya"
         * adresse_given[1] should be "Daira"
         */
        this.adresse[0]=adresse_given[0];
        this.adresse[1]=adresse_given[1];

    }

    /*this one is for the doctor and the admin */
    public Personne(int id,String name, String firstName,String mail,int phoneNumber,String adresse_given[] ){
        this.id=id;
        this.name=name;
        this.firstName=firstName;
        this.phoneNumber=phoneNumber;
         this.adresse[0]=adresse_given[0];
        this.adresse[1]=adresse_given[1];
        this.mail=mail;
        
        
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

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the phoneNumber
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
 }
