package com.manish.mindflur;

public class SwappingUsingThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=10;
int y=20;
System.out.println("Before Swapping\n");
System.out.println("value of x:"+x);
System.out.println("value of y:"+y+"\n");

int z=x;
x=y;
y=z;
System.out.println("After Swapping\n");
System.out.println("value of x:"+x);
System.out.println("value of y:"+y);

	}

}
