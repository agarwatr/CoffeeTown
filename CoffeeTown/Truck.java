/**
 * Write a description of class Truck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Truck
{
    // instance variables - replace the example below with your own
    //private Path path;
    private boolean flag; //whether truck has been used or not--false if not used and true if used
    private Location currentLocation;

    /**
     * Constructor for objects of class Truck
     */
    public Truck(Location location)
    {
        flag=false;
      //  path=null;
        currentLocation=location;
    }
}
