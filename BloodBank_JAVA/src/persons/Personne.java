package persons;

/**
 * Created by fcmam5 on 11/13/15.
 * Implemented by nesrinehanane
 */
abstract class Personne {
    private String name;
    private String firstName;
    private String grouping;
    private String [] adresse= new String[2];

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
        public Personne(String name, String firstName, String grouping , String adresse[]){
        this.grouping=grouping;
        this.name=name;
        this.firstName=firstName;
        this.adresse[0]=null;
        this.adresse[1]=null;


    }
    public Personne(String name, String firstName){
        this.name=name;
        this.firstName=firstName;
    }
}
