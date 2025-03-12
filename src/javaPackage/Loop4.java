package javaPackage;

public class Loop4 {
    public static void main(String[] args) {
        int i=1;
        do {        //in this body will atleast execute one time even if condition is false
            System.out.println(i);
            i++;
        }while(i<0);

    }
}


