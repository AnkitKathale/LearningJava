package javaPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Object> obj=new ArrayList<Object>();  //Creating arraylist
        obj.add(1);
        obj.add("Selenium");
        obj.add(7.0);
        obj.add('c');
        obj.add(10<12);
        System.out.println(obj); //Printing arraylist (easy)
        //Print arraylist way(second way)
        for(Object bcd:obj){
            System.out.println(bcd);
        }
        //Print arraylist (third way)
        Iterator abc= obj.iterator();
        while(abc.hasNext()){
            System.out.println("WHILE LOOP  + "+abc.next());
        }
    }
}
