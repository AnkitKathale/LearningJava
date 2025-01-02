package javaPackage;

public class Static3 {
    int rollno;//declaring global variable
    String college = "IIT BOMBAY";//declaring global variable
    static String name = "test";//declaring static variable

    Static3(int r,String c){
        rollno=r;
        college=c;
    }
    public void getResult(){
        System.out.println(rollno +" "+ name+ " "+ college  );
    }


}
