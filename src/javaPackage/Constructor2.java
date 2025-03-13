package javaPackage;

public class Constructor2 {
    int id;
    String name;
    String address;
    //Default constructor
    Constructor2(){
        System.out.println("DEFAULT CONSTRUCTOR");
    }
    Constructor2(int a,String b, String c){
        this.id=a;
        name=b;
        address=c;
    }
    public void getInfo(){
        System.out.println(id +"  "+name+"  "+address);
    }

    public static void main(String[] args) {
        //Default constructor
        Constructor2 c2 = new Constructor2();
        //Parameterized constructor
        Constructor2 c3= new Constructor2(1,"John","Belapur");
        c3.getInfo();
        Constructor2 c4= new Constructor2(2,"Ankit","Vashi");
        c4.getInfo();

    }

}
