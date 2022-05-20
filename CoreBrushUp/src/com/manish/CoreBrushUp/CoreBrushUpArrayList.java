package com.manish.CoreBrushUp;
import java.util.*;
public class CoreBrushUpArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>list=new ArrayList<String>();
list.add("Mahi");
list.add("Jenny");
list.add("Saim");
list.add("Suraj");
System.out.println(list);
System.out.println("Value at 3rd index:"+list.get(3)+"\n");

System.out.println("Iteration Of ArrayList");
Iterator<String>itr= list.iterator();
while(itr.hasNext()) {
String i=itr.next();
System.out.println(i);	
}
	}

}
