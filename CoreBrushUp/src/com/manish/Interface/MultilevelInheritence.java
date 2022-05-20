package com.manish.Interface;
class company{
	public void Microsoft() {
		System.out.println("it's a IT Company");
	}
}
class samsung extends company{
	public void mobile() {
		System.out.println("this is smartfone production company");
	}
}
// multilevel inheritence

/*
 * class Dell extends samsung{ public void run() {
 * System.out.println("it's a laptop production company"); } }
 */

//Hierarchial inheritence

class Dell extends company{
	public void run() {
		System.out.println("it's a laptop production company");
	}
}
public class MultilevelInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dell d=new Dell();
d.run();
//d.mobile();
d.Microsoft();
samsung s=new samsung();
s.mobile();
}

}
