package javaPackage;

public class Static2 {
    int rollno;//declaring global variable
    String college;//declaring global variable
    String name;//declaring global variable

    public static void main(String[] args) {
        Static2 s2 = new Static2();
        System.out.println(s2.college);//null
        System.out.println(s2.name);//null
        System.out.println(s2.rollno);//0
    }
}
