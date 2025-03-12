package javaPackage;

public class Array2 {
    public static void main(String[] args) {
        int b[]={1,2,3,4,5};
        String s[]={"Ankit","Akash","Amit"};
        Object o[]={"Selenium",'c',10.5,15};

        System.out.println(b.length);
        System.out.println(s.length);
        System.out.println(o.length);

        s[2]="Navneet";
        System.out.println(s[2]);
    }
}
