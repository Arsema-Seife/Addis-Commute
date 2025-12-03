package abstractclasses;

import interfaces.Displayable;


public abstract class LocationEntity implements Displayable {
    protected String id;
    protected String name;
    protected double latitude;
    protected double longitude;

    //constructor
    public LocationEntity(String id, String name, double latitude, double longitude) {
        this.id = id;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    //display details
    @Override
    public abstract void displayDetails();
}
