public class Garbage_Collection
{
    double radius;

    Garbage_Collection()
    {
        radius = 0.2;
    }

    public static void main(String[]args)
    {
        Garbage_Collection crap = new Garbage_Collection();
        crap = null; //Remove Reference
        System.gc(); //Request JVM to perform garbage collection
    }
}
