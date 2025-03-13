package javaPackage;

public class Constructor3 {
    //Default Constructor
    Constructor3(){
        System.out.println("NO PARAMETER");
    }
    Constructor3(int a){
        System.out.println("int parameter");
    }
    Constructor3(String s){
        System.out.println("String parameter");// this means constructor can be overloaded
    }
}
