package javaPackage;

public class Inheritance2 extends Inheritance1{
    static int b=10;

    public static void main(String[] args) {
        System.out.println(b);
        System.out.println(a);
        Inheritance2 in = new Inheritance2();
        System.out.println(in.c);
        in.getD(69);
        in.getE(420);
        getF(810);
       try{
           in.c= 20/0;
       } catch (Exception e) {
           System.out.println(e);
           e.printStackTrace();

       }
        System.out.println("Exception handled");




    }
}
