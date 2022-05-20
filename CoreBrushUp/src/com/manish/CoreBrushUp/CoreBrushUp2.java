package com.manish.CoreBrushUp;

public class CoreBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//  implementation of Arrays & For Loop
		int sum=0;
int arr[]=new int[] {12,23,22,21,20};
for(int i=0;i<arr.length;i++) {
	 
	 sum=sum+arr[i];
	System.out.println(arr[i]);
	
}
System.out.println("Total sum of numbers present in the Array:"+sum+"\n");
System.out.println("For String");
String[]name= {"Manish","Shivam","Vikash","Avinash"};
for(int i=0;i<name.length;i++) {
	if(name[i]=="Raj") {
		System.out.println("RAj is present in array");
		break;
	}else {
		System.out.println(name[i]);

	}
}
}
}