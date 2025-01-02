package javaPackage;

public class Static7
{
    String a;
    int b;//declaring 2 static variables
    static int c=4; //static variable defining

    public static void a(){
        System.out.println("He;llo static");

    }

    public static void main(String[] args) {
        Static7 s7= new Static7();
        s7.a="selenium";
        c=45;
        s7.b=69;
        System.out.println(s7.a);
        a();
        System.out.println(c);

    }
}
