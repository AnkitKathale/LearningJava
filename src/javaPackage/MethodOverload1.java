package javaPackage;

public class MethodOverload1 {
    public void add(int x,int y){
        int a=x+y;
        System.out.println(a);
    }
    public void add(int x,int y,int z){
        int a=x+y+z;
        System.out.println(a);
    }
    public void add(String s){
        System.out.println(s);
    }
    public void add(float f){
        System.out.println(f);
    }

    public static void main(String[] args) {
        MethodOverload1 m1= new MethodOverload1();
        m1.add(10);
        m1.add(10,20);
        m1.add("Ankit");
        m1.add(10,20,30);
    }
}
