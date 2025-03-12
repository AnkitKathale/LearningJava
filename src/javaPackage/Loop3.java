package javaPackage;

public class Loop3 {
    public static void main(String[] args) {
        int i=10;
        while(i<15 & i<12){
            System.out.println(i);
            i++;    //10 will become 11 which is less than 15 and less than 12
            //then 11 will become 12 which is less than 15 and is not less than 12

        }
    }
}
