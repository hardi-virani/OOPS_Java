public class TV
{
    int channel;
    int volumelevel;
    boolean on;


    //Fields: channel, volumeLevel, on
    //Methods: turnOn(), turnOff()
    //Constructor: Initializes the object with default values.


    //Constructor
    TV()
    {
        channel=1;
        volumelevel=10;
        on = false;
    }

    void turnOn()
    {
        on = true;
    }
    void turnOff()
    {
        on = false;
    }

    public static void main(String[]args)
    {

    }
}
