package javaPackage;

final class Encapsulation2 extends Encapsulation1{
//    final void b(){  as it is final method we cannot override it
//
//    }
public static void main(String[] args) {
    Encapsulation2 e2 = new Encapsulation2();
    e2.setName("Ankit");
    System.out.println(e2.getName());

}
}
