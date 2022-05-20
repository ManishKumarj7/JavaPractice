package com.manish.mindflur;
import java.util.*;
public class SwappingWithoutUsingThirdVariable {
public static void main(String []args) {
	
	//Swap two numbers Without using third variables:
	int x,y;
	System.out.println("Enter Value of X and Y:");
	Scanner sc=new Scanner(System.in);
	x=sc.nextInt();
	y=sc.nextInt();
	System.out.println("Before Swapping");
	System.out.println("Value of x:"+x);
	System.out.println("Value of y:"+y+"\n");
	
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("After Swapping");
	System.out.println("Value of x:"+x);
	System.out.println("Value of y:"+y);
	
}
}
