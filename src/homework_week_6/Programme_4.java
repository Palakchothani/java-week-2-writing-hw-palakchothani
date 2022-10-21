package homework_week_6;

public class Programme_4
{
    //Instance variables
    String a="Prime";
    String b="Testing";
    //Static variables
    static boolean x = true;
    static boolean y = false;
    public static void main(String[] args)
    {
        Programme_4 h=new Programme_4();
        h.method1();//Calling instance method from static method by creating object
        method2();
    }
    //Instance method
    public void method1()
    {
        //Instance area
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
    }
    //Static method
    public static void method2()
    {
        //Static area
        Programme_4 h1=new Programme_4();
        System.out.println(h1.a); //Calling instance variable from static method by creating object
        System.out.println(h1.b);
        System.out.println(Programme_4.x);//Calling by class
        System.out.println(y);//Calling directly
    }
}

