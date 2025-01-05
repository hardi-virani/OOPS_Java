//Signature same then override.
public class Test
{
    int x;

    //Default Constructor
    public Test()
    {
        x=2;
    }

    //Parametrised Constructor
    public Test(String t)
    {
        System.out.println("Test");
    }

    public static void main(String[] args)
    {
        Test test = new Test();
        System.out.println(test.x);

        Test test2 = new Test("Hardi");
        System.out.println(test2.x);

}