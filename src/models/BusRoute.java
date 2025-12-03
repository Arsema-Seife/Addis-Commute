package models;

import abstractclasses.AbstractRoute;
import java.util.List;

/**
 * Represents a bus route
 */
public class BusRoute extends AbstractRoute {

    public BusRoute(String routeId, String routeName, List<BusStop> stops) {
        //super(routeId, routeName, stops);
    }

    public List<BusStop> getStops() {
        return stops;
    }

    @Override
    public boolean isStopOnRoute(BusStop stop) {
        //return stops.contains(stop);
    }

    @Override
    public double calculateRouteDistance() {
        // Simple placeholder: each stop = 1 km
        //return stops.size() * 1.0;
    }

    @Override
    public void displayDetails() {
       // System.out.println("Route: " + routeName + " | Stops: " + stops.size() + " | Distance: " + calculateRouteDistance() + " km");
    }
}
