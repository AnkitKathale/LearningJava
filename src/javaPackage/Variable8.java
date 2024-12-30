package javaPackage;

public class Variable8 {
    int b = 10;//global variable

    static int c =12;

    public static void b(){
        int e =15;//local variable
        System.out.println(e);
    }
    public void g(){
        int g=5;
        System.out.println(g);
    }

    public static void main(String[] args) {
        int a =6;//local variable
        System.out.println(a);//6
        //static variable
        System.out.println(c);//static method can call static variable
        b();//you can call static method in another static method directly
        //for non static variables and methods you will have to create object of the class in which they are present in
        Variable8 v8=new Variable8();

        System.out.println(v8.b);
        v8.g();
    }
}
