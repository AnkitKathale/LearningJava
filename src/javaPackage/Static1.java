package javaPackage;

public class Static1 {
    int x=100;//global variable
    String s="hello";//global variable
    static int y=100;//static vatiable

    public static void aMethod(){
        String x="hi";
        System.out.println(x);//calling variable - hi
    }
    public static void bMethod(){
        int i=100;//local variable
    }
}
