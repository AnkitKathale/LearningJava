package hundredPrograms;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int a=sc.nextInt();
        System.out.println("Enter second number :");
        int b=sc.nextInt();
        int c=a;
        a=b;
        b=c;


        System.out.println(a);
        System.out.println(b);
    }
}
