package Interview;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1="listet";
        String s2="silent";
        char [] c=s1.toLowerCase().toCharArray();
        char [] d=s2.toLowerCase().toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);

        if(Arrays.equals(c,d)){
            System.out.println("THIS IS ANAGRAM");
        }
        else {
            System.out.println("THIS IS NOT ANAGRAM");
        }
    }
}
