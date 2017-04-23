
/**
 * Write a description of class Warehouse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Warehouse
{
    // instance variables - replace the example below with your own
    private Location location; //location of warehouse
    int id; //idNumber
    Truck[] arrayOfTrucks; //number of trucks in warehouse

    /**
     * Constructor for objects of class Warehouse
     */
    public Warehouse(int idNumber, Location l, int numbTrucks) 
    {
        id=idNumber;
        location=l;
        arrayOfTrucks = makeArray(numbTrucks);//new Truck[numbTrucks];
        //for each truck set current location equal to location
    }
    
    public Truck[] makeArray(int num)
    {
        Truck[] array= new Truck[num];
        for (int i=0;i<num; i++)
        {
            array[i]=new Truck(location);
        }
        return array;
    }
    
    public Location getLocation()
    {
        return location;
    }
}
