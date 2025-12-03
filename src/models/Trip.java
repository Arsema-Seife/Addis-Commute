package models;
import services.*;

public class Trip {
    public String tripId;           
    public String busRouteId;       
    private String startStop;       
    private String endStop;          
    private double departureTime;     
    private  double arrivalTime;        
    public double fare;             

    

    public Trip() {
        
    }

   
    public Trip(String tripId, String busRouteId, String startStop, String endStop,
            double departureTime, double arrivalTime, double fare) {
        this.tripId = tripId;
        this.busRouteId = busRouteId;
        this.startStop = startStop;
        this.endStop = endStop;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.fare = fare;
    }

   
    public String getStartStop() {
        return startStop;
    }

    public String getEndStop() {
        return endStop;
    }

    public double getDepartureTime() {
        return departureTime;
    }

    public double getArrivalTime() {
        return arrivalTime;
    }

    
    public void setStartStop(String startStop) {
        this.startStop = startStop;
    }

    public void setEndStop(String endStop) {
        this.endStop = endStop;
    }

    public void setDepartureTime(double departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrivalTime(double arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    

    
    public long Duration() {
        //get the estimated time from the service package displays the time for user 
        return 0;
    }

    
    public void displayTripInfo() {
        
    }

}

