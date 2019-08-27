class Info
{
    public Info()
    {
        System.out.println("Default Constructor");
    }

    public Info(int a)
    {
        System.out.println("Parameterize Constructor and value passed from main is: "+a);
    }

    public Info(double a)
    {
        System.out.println("Constructor 3 and value passed from main is: "+a);
    }


}


public class Student
{
    public static void main(String p[])
    {
        Info a=new Info(7.5);

    }
}
