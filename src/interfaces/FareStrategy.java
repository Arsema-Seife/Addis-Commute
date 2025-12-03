package interfaces;

import models.BusRoute;
import models.BusStop;

/**
 * Strategy interface for calculating fare
 */
public interface FareStrategy {
    double calculateFare(BusRoute route, BusStop start, BusStop end);
}
