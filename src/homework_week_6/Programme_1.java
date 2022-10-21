package homework_week_6;

public class Programme_1
{

    int a = 10;
    int b = 20;

    public static void main(String[] args)
    {
       Programme_1 p = new Programme_1();
       p.myMethod();
    }
    // Instance method
     public void myMethod()
     {
         Programme_1 p= new Programme_1();
         System.out.println(p.a);
         System.out.println(p.b);
     }
}
