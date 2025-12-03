package services;

import interfaces.FareStrategy;
import models.BusRoute;
import models.BusStop;

/**
 * Simple fare calculation based on distance
 */
public class DistanceFareStrategy implements FareStrategy {
    private double baseFare = 2.0;
    private double perKmRate = 0.5;

    @Override
    public double calculateFare(BusRoute route, BusStop start, BusStop end) {
      //  double distance = route.calculateRouteDistance();
      //  return baseFare + (distance * perKmRate);
    }
}
