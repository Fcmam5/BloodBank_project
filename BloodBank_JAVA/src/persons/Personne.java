package persons;

/**
 * Created by fcmam5 on 11/13/15.
 * Implemented by nesrinehanane
 */
abstract class Personne {
  private String name;
    private String firstName;
    private char grouping;

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
    public void setGrouping(char grouping){
        this.grouping=grouping;
    }
    public char getGrouping(){
        return this.grouping;
    }


}
