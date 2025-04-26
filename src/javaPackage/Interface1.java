package javaPackage;

public interface Interface1 {
    public abstract void a();
    public void b(); // automatically abstract in interface

    // Remove this block for Java 7
    // public static void add(){
    //     System.out.println("add");
    // }

    // Also remove main method if not needed
}
