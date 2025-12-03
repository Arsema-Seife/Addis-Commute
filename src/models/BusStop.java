package models;

import abstractclasses.LocationEntity;

// A bus stop location
public class BusStop extends LocationEntity {

    // Create a bus stop with basic details
    public BusStop(String id, String name, double latitude, double longitude) {
        super(id, name, latitude, longitude);
    }

    // Calculate distance from user to this stop
    public double calculateWalkingDistance(double userLat, double userLon) {
        //distance calculation
        return 0.0;
    }

    // Find closest stop from a list of stops
    public static BusStop getNearestStop(double userLat, double userLon, BusStop[] stops) {
        //nearest stop search
        return null;
    }

    //stop information
    @Override
    public void displayDetails() {
       //display
    }

    // Return stop as string for display
    @Override
    public String toString() {
        //string format
        return "";
    }
}