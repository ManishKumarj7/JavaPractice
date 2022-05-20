package com.manish.CoreBrushUp;
import java.util.*;
public class CoreBrushUp3_ArrayWithSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="The Name is Manish";
String[]champ=s.split("Name");
System.out.println(champ[0]);
System.out.println(champ[1]);


System.out.println(champ[1].trim()+"\n");
for(int i=0;i<champ.length;i++) {
	System.out.println(champ[i]);
	
}
System.out.println("\nChar at index 1:"+s.charAt(2));
System.out.println("\n Characters in reverse Order");
for(int i=champ.length-1;i>=0;i--) {
	System.out.println(champ[i]);
}
	}

}
