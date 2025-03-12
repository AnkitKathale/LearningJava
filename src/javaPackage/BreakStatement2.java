package javaPackage;

public class BreakStatement2 {
    public static void main(String[] args) {
        for(int i=1;i<3;i++)
        {   //outer loop
            for(int j=1;j<3;j++){
                //inner loop
                if(i==2 && j==2){
                    break;
                }
                System.out.println(i + "       "+ j);
            }
            System.out.println("Out of inner loop");

        }
        System.out.println("Out of outer loop");
    }
}
