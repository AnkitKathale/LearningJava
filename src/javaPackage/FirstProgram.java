package javaPackage;

public class FirstProgram {
    int a=5; //global variable
    static int b=5;//static variable
    public static void main(String[] args) {        //Main method
        System.out.println("Hello world");          //print statement
        aMethod();//Calling method
        bMethod();//Calling method
    }
    public static void aMethod(){       //user defined method
        int c=50;
        System.out.println(c);
    }
    public static void bMethod(){       //user defined method
        int d=15;
        System.out.println(d);
    }
}
