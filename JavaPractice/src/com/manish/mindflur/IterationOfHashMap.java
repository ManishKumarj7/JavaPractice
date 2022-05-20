package com.manish.mindflur;
import java.util.*;
public class IterationOfHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer, String>map=new HashMap<Integer, String>();
map.put(1, "Manish");
map.put(2, "Shivam");
map.put(3, "Vikash");

Iterator itr=map.entrySet().iterator();
System.out.println("While Loop");
while(itr.hasNext()) {
	Map.Entry me=(Map.Entry) itr.next();
	System.out.println("key is:"+me.getKey()+"  Value is:"+me.getValue());
	
}
System.out.println("For Loop");
for(Map.Entry me2:map.entrySet()) {
	System.out.println("key is:"+me2.getKey()+"  Value is:"+me2.getValue());

}
	}
}
