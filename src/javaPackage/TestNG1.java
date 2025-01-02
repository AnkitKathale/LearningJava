package javaPackage;

import org.testng.annotations.*;

public class TestNG1 {
    @Test
    public void a2(){
        System.out.println("a2");
    }
    @BeforeTest
    public void b(){
        System.out.println("b");
    }
    @BeforeSuite
    public void c(){
        System.out.println("c");
    }
    @AfterMethod
    public void d(){
        System.out.println("d");

    }
    @BeforeClass
    public void e(){
        System.out.println("e");
    }
    @AfterTest

    public void f(){
        System.out.println("f");
    }

    @AfterClass
    public void g(){
        System.out.println("g");
    }
    @BeforeMethod
    public void h(){
        System.out.println("h");
    }

    @AfterSuite
    public void i(){
        System.out.println("i");
    }
    @Test
    public void a1(){
        System.out.println("a1");
    }
    @Test
    public void A1(){
        System.out.println("A1");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }
}
