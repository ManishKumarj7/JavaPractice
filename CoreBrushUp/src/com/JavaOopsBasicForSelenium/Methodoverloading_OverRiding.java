package com.JavaOopsBasicForSelenium;

// Method OverLoading
class Mobile{
	static int sum(int a,int b) {
		return a+b;
	}
	static double sum(double x,double y) {
		return x + y;
	}
	void run() {
		System.out.println("Method Overriding");
	}
}
class OverRiding extends Mobile{
	void run() {
		System.out.println("method overriding executed");
	}
	
}
public class Methodoverloading_OverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Mobile.sum(11, 220));
System.out.println(Mobile.sum(85, 890));
OverRiding ovr=new OverRiding();
ovr.run();
	}

}
