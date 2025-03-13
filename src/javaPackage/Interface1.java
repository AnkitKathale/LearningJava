package javaPackage;

public interface Interface1 {
    public abstract void a();
    public void b();
    //every method in interface is abstract regardless of keyword "Abstract"
    public static void main(String[] args) {

    }
    public static void add(){   //static methods are allowed java 8+
        System.out.println("add");
    }

}
