package javaPackage;

public class Loop2 {
    public static void main(String[] args) {
        Object a[]={"Selenium",10.5,2>1,4,'c'};
        for(int i=0;i<a.length;i++){   //normal method
            System.out.println(a[i]);
        }
        for(Object b:a){    //another method
            System.out.println(b);
        }

    }
}
