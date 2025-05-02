package HackerRank;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();

        Double d=scan.nextDouble();
        scan.nextLine();
        String s=scan.nextLine();
        scan.close();

        System.out.println("String: " + s);
        System.out.println("Int: " + i);
        System.out.println("Double: " + d);


        // Write your code here.




    }
}
