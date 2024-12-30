package javaPackage;

public class FirstProgram {
    int a=5; //global variable
    static int b=5;//static variable
    public static void main(String[] args) {        //Main method
        System.out.println("Hello world");          //print statement
        aMethod();//Calling a method
        bMethod();//Calling  b method
    }
    public static void aMethod(){       //user defined method
        int c=50;
        System.out.println(c);          //calling variable
    }
    public static void bMethod(){       //user defined method
        int d=15;
        System.out.println(d);
    }
    public  void cMethod(){
        System.out.println("Non static method we have to create object");
    }
}
