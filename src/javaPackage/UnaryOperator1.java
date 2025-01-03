package javaPackage;

public class UnaryOperator1 {
    public static void main(String[] args) {
        int a = 5; //defining variable
        System.out.println(a);//5
        System.out.println(a++);// 5 will be stored in memory then it will increment to 6
        System.out.println(a);//now it will become 6
        System.out.println(a++);// 6 will be stored in memory then it will increment to 7
        System.out.println(++a);//as this is pre increment previous value is incremented (7 to 8) and will remain 8
        System.out.println(a--);//8,7
        System.out.println(a);//7
        System.out.println(--a);//6,6
    }

}
