package Interview;

public class CountOccurence {
    public static void main(String[] args) {
        String s="Java is object oriented programming";

        int result=s.length()-s.replaceAll("z","").length();
        System.out.println(result);

    }
}
