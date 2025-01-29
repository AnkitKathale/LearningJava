package hundredPrograms;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Upto where you want to print series ");
        int num = sc.nextInt();
        int num1 =0;
        int num2=1;
        int num3;

        for(int i =1;i <num ; i++){
            num3=num1+num2;
            num2=num1;
            num1=num3;
            System.out.println(num3);

        }
    }
}
