package javaPackage;

public class MethodOverride4 extends MethodOverload3{
    public void run(){
        System.out.println("you are running");
    }

    public static void main(String[] args) {
        MethodOverride4 m4= new MethodOverride4();//6546//
        m4.run();
        MethodOverride3 m3= new MethodOverride3();
        m3.run();
    }

}
