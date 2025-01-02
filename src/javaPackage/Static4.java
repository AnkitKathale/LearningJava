package javaPackage;

public class Static4 {
    public static void main(String[] args) {
        Static3 s3=new Static3(10,"ITM");
        Static3 s4=new Static3(11,"ITM - finance");
        Static3 s5=new Static3(12,"ITM - logistics");
        s3.getResult();
        s4.getResult();
        s5.getResult();
    }
}
