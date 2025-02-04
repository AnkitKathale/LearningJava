package hundredPrograms;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter factorial number :");
        int a=sc.nextInt();
        int fac = 1;
        for(int i = 1;i<=a;i++){
            fac = fac * i; // 1 *1 then 1* 2 then 2*3 then 6*4 then 24*5
        }
        System.out.println(fac);

    }
}
