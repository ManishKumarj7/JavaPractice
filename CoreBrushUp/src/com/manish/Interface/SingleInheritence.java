package com.manish.Interface;
 class Animal{
public void run() {
	System.out.println("Animal r running");
}
}
 class Dog extends Animal{
	 public void bark() {
		 System.out.println("Dog are barking");
	 }
 }
public class SingleInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog d=new Dog();
d.run();
d.bark();

	}

}
