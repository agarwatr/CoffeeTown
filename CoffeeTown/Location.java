
/**
 * Write a description of class Location here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Location
{
    // instance variables 

    //X coordinate
    private int x;

    //Y coordinate
    private int y;

    /**
     * Constructor for objects of class Location
     * @param int x coordiante
     * @param int y coordinate
     */
    public Location(int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    public int[] getLocation(){

        int [] location=new int[2];
        location[0]=x;
        location[1]=y;
        return(location);

    }
}
