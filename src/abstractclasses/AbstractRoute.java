package abstractclasses;

import models.BusStop;
import interfaces.Displayable;
import java.util.List;

/**
 * Abstract class representing a route (BusRoute)
 */
public abstract class AbstractRoute implements Displayable {
    protected String routeId;
    protected String routeName;
    protected List<BusStop> stops;

    public AbstractRoute(String routeId, String routeName, List<BusStop> stops) {
        this.routeId = routeId;
        this.routeName = routeName;
        this.stops = stops;
    }

    public abstract boolean isStopOnRoute(BusStop stop);
    public abstract double calculateRouteDistance();
}
