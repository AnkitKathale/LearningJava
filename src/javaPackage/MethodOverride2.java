package javaPackage;

public class MethodOverride2 extends MethodOverride1{
    public void eat(){
        System.out.println("I am done eating");
    }

    public static void main(String[] args) {
        MethodOverride2 m2 = new MethodOverride2();
        m2.eat();//Child method will always get preference
        //Method overriding only works in inheritance

    }
}
