package hundredPrograms;

import java.util.Scanner;

public class SwapNumbersWIthoutVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int a = sc.nextInt();
        System.out.println("Enter second number :");
        int b =sc.nextInt();

        a= a + b; // 10 + 15 25
        b = a-b; // 25 - 10 15
        a= a-b ;// 25 - 15  10


        System.out.println(a);
        System.out.println(b);

    }
}
