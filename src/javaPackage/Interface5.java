package javaPackage;

public class Interface5 extends Inheritance1 implements Interface3,Interface4{

    public void a() {
        System.out.println("a method");
    }


    public void b() {
        System.out.println("B method");
    }

    public static void main(String[] args) {
        Interface5 i5=new Interface5();
        i5.a();
        i5.b();//We can use interface in normal classes too
        System.out.println(a);
    }
}
