package javaPackage;

public class Static5 {
    static int z=5;//global static variable
    int y =1;//global variable

    public static void a(){
        z=10;//modifying variable value
        System.out.println(z);
    }
    public void b(){
        y=15;
        System.out.println(y);//15
    }

    public static void main(String[] args) {
        System.out.println(z);
        Static5 s5 = new Static5();
        System.out.println(s5.y);//calling only variable so value same
        s5.b();//calling method now so value change
    }
}
