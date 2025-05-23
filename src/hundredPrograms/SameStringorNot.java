package hundredPrograms;

import java.util.Arrays;

class SameSortingorNot {
    static boolean checkEqual(int[] a, int[] b) {

        // If lengths of array are not equal means
        // array are not equal
        if (a.length != b.length) return false;
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i])
                return false;

        // If all elements were same.
        return true;
    }

    public static void main(String[] args) {
        int[] a ={1,2,3,6,5};
        int[] b ={1,2,3,4,5};
        if (checkEqual(a, b))
            System.out.println("true");
        else
            System.out.println("false");
    }
}