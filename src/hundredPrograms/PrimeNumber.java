package hundredPrograms;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();

        if(a==0){
            System.out.println("test");
        }
        else {
            System.out.println("Non prime number");
        }
    }
}
