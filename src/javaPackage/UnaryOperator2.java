package javaPackage;

public class UnaryOperator2 {
    public static void main(String[] args) {
        int a = 10;//local
        int b= 10;//local
        System.out.println(a++);//10,11
        System.out.println(a++ + ++a);//11,12 13,13 so 11+13 = 24 as here only memor allocated values are considered which are first values after operation it will move to second value
        System.out.println(a + a++);// 13 13,14 output will be 26 same logic as before
        System.out.println(a + ++a);//14 15,16 output will be 14+15=29 same logic as line number 8
        System.out.println(b++ + b--);//10,11 11,10 output will be 10+11=21
        System.out.println(b-- + b++);//10,9 9,10 output will be 19 =(10+9)
        System.out.println(b-- + ++b);//10,9 10,10 output will be 10+10 =20
    }
}
