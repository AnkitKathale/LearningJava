package Interview;

public class CountOccurence {
    public static void main(String[] args) {
        String s="Java is object oriented programming";

        int result=s.length()-s.replaceAll("a","").length();
        System.out.println(result);

    }
}
