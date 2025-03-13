package javaPackage;

public abstract class Abstraction1 {
    static int a=5;
    int b=5;
    final int c=10;
    //abstract method
    public abstract void eat();//Abstract method does not have body

    //non abstract method
    public void a(){
        System.out.println("Non abstract method");
    }
}
