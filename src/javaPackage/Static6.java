package javaPackage;

public class Static6 {
    int x=100;//global variable
    static int y=5;//static global variable

    public void a(){
        int z=10;
        System.out.println(z);//10
    }
    static int b =6;

    public static void b(){
        int a = 5;
        System.out.println(a);//5
    }

    public static void main(String[] args) {
        Static6 s6=new Static6();
        System.out.println(s6.b);//this is techinally correct but its not recommended
        System.out.println(b);
        s6.a();
        s6.b();//again correct but not recommeneded

    }

}
