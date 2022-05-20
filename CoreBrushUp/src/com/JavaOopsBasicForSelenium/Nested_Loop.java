package com.JavaOopsBasicForSelenium;

public class Nested_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=0;i<=4;i++) {
	System.out.println("Outer loop");
	//System.out.println(i);
	for(int j=i;j<=4;j++) {
		System.out.println("\n\ninner loop");
		//System.out.println(j);
	}
	System.out.println("Outer Loop Finished");
}
	}

}
