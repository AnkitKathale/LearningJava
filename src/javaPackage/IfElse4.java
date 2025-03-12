package javaPackage;

public class IfElse4 {
    public static void main(String[] args) {
        int age=25;
        int weight=50;
        if(age>18){
            if(weight>=50){
                System.out.println("Eligible");
            }
            else{
                System.out.println("Not Eligible");
            }
        }
        else{
            System.out.println("Candidate is not elibigle Age wise");
        }
    }
}
