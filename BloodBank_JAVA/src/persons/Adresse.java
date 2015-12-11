package persons;
public class Adresse {
    
    private String wilaya ;
    private String dayra ; 
    
    public Adresse(String wilaya, String dayra) {
        this.wilaya = wilaya;
        this.dayra = dayra;
    }

    public String getWilaya() {
        return wilaya;
    }

    public String getDayra() {
        return dayra;
    }

    public void setWilaya(String wilaya) {
        this.wilaya = wilaya;
    }

    public void setDayra(String dayra) {
        this.dayra = dayra;
    }
    
    
    
}
