package javaPackage;

public class interface2 implements Interface1{
    @Override
    public void a() {
        System.out.println("method a");
    }

    @Override
    public void b() {
        System.out.println("method b");
    }

    public static void main(String[] args) {
        interface2 i2=new interface2();
        i2.a();
        i2.b();

    }
}
