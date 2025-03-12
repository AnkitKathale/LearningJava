package javaPackage;

public class Inheritance4 extends Inheritance3{
    public void multiply(int x, int y){
        z=x*y;
        System.out.println(z);
    }

    public static void main(String[] args) {
        int x=20; int y=10;
        Inheritance4 in4=new Inheritance4();
        in4.add(x,y);
        in4.sub(30,20);
        in4.multiply(x,y);

    }
}
