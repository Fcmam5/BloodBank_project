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
    private double poids;
    private Adresse adresse;
    private String mail;
    private int phoneNumber;
     
    String Dayra = null;
    String Wilaya = null;


    public Personne(
            int id, 
            String name, 
            String firstName, 
            int age, 
            String grouping , 
            Adresse adresse,
            String mail, 
            int phoneNumber,
            double poids){
        this.id=id;
        this.grouping=grouping;
        this.name=name;
        this.firstName=firstName;
        this.age = age;
        this.mail=mail;
        this.phoneNumber=phoneNumber;
        this.poids=poids;
        adresse.setDayra(Dayra);        
        adresse.setWilaya(Wilaya);
       

    }

    /*this one is for the doctor and the admin */
    public Personne(
            int id,
            String name, 
            String firstName,
            String mail,
            int phoneNumber,
            Adresse adresse){
        
        this.id=id;
        this.name=name;
        this.firstName=firstName;
        this.phoneNumber=phoneNumber;
        this.mail=mail;
        adresse.setDayra(Dayra);        
        adresse.setWilaya(Wilaya);
        
        
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

    /**
     * @return the poids
     */
    public double getPoids() {
        return poids;
    }

    /**
     * @param poids the poids to set
     */
    public void setPoids(double poids) {
        this.poids = poids;
    }

    /**
     * @return the adresse
     */
    public Adresse getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
 }
