package com.manish.mindflur;
import java.util.*;
public class WithoutReverseFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="Bengaluru";
char champ[]=name.toCharArray();
for(int i=champ.length-1;i>=0;i--) {
	System.out.println(champ[i]);
}

String n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter String:");
n=sc.nextLine();
String[]champ1=n.split("");
for(int i=champ1.length-1;i>=0;i--) {
	System.out.print(champ1[i]);
}

	}

}
