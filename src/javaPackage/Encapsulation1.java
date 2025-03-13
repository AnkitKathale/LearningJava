package javaPackage;

public class Encapsulation1 {
    String name;
    int b;
    final int c=2;

    public void a(){
       // c=5; final variable value cannot be changed
    }
    final void b(){
        System.out.println("Final method");
    }
    public void setName(String s){
        this.name =s;
        this.b=5;

        System.out.println(c);
        System.out.println(b);
    }
    public String getName(){
        return name;

    }

}
