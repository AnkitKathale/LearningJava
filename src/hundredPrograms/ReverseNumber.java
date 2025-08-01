package hundredPrograms;

public class ReverseNumber {
    public static void main(String[] args) {
        int originalNumber = 12345;
        int reversedNumber = 0;

        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            originalNumber /= 10; // Same as originalNumber = originalNumber / 10;
        }

        System.out.println("Reversed Number: " + reversedNumber); // Output: 54321
    }
}
