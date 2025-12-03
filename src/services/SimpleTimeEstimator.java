package services;

import interfaces.TimeEstimator;
import models.BusRoute;
import models.BusStop;

public class SimpleTimeEstimator implements TimeEstimator {
    @Override
    public double estimateBusTravelTime(BusRoute route, BusStop start, BusStop end) {
        return 0.0;
    }

    @Override
    public double estimateWalkingTime(double distance) {
        return 0.0;
    }

    @Override
    public double estimateTotalTravelTime(BusRoute route, BusStop start, BusStop end, double userLat, double userLon) {
        return 0.0;
    }
}
