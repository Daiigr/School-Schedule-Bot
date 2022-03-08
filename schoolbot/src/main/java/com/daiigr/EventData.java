public class EventData {
    private int ID;
    private String Name;;
    public EventData(int ID, String Name){
        this.ID = ID;
        this.Name = Name;;
    }

    public EventData(){
        this.ID = 0;
        this.Name = "";
    }

    public int getID(){
        return ID;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;

    }

     

    
    
}
