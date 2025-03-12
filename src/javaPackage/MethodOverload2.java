package javaPackage;

public class MethodOverload2 extends MethodOverload1{
    public static void main(String[] args) {
        MethodOverload2 m2= new MethodOverload2();
        m2.add(10);
        m2.add(10,20,30);
    }
}
