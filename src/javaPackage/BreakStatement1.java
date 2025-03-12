package javaPackage;

public class BreakStatement1 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
          if(i==3){
              break;    //this condition will break the loop
          }
            System.out.println(i);
        }
        System.out.println("Out of loop");
    }
}
