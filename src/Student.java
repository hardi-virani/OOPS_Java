//Default Values for Object Field
public class Student
{
    String name="Hardi";
    int age=22;
    boolean isscienceMajor=true;
    char gender='F';

    public static void main(String[]args)
    {
        Student s = new Student();
        System.out.println("Name: "+ s.name);
        System.out.println("Name: "+ s.age);
        System.out.println("Name: "+ s.isscienceMajor);
        System.out.println("Name: "+ s.gender);
    }
}
