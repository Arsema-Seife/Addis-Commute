package interfaces;

import models.BusRoute;
import models.BusStop;

public interface TimeEstimator {
    double estimateBusTravelTime(BusRoute route, BusStop start, BusStop end);
    double estimateWalkingTime(double distance);
    double estimateTotalTravelTime(BusRoute route, BusStop start, BusStop end, double userLat, double userLon);
}
