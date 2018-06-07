
 //* @author Zu
 
public class Flight {
    private String planeId;
    private String departureCode;
    private String arrivalCode;
    
    public Flight(String planeId, String departure, String arrival){
        this.planeId = planeId;
        this.departureCode = departure;
        this.arrivalCode = arrival;
    }
   
    public String getPlaneId(){
        return this.planeId;
    }
    
    
    @Override
    public String toString(){
        return "("+departureCode+"-"+arrivalCode+")";
    }
}
