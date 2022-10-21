package homework_week_6;

public class Programme_3
{
    String name = "Prime";
    static String surname = "Testing";

    void instanceMethod(){
        System.out.println(name);
        System.out.println(surname);
    }
    public static void staticmethod(){
        System.out.println(surname);
        Programme_3 programme_3 = new Programme_3();
        System.out.println(programme_3);


    }
    public static void main(String[]args){
        Programme_3 programme_3 = new Programme_3();
        programme_3.instanceMethod();
        staticmethod();
    }
}


