package com.manish.Abstract;

public class ChildGoFirst extends Aircraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildGoFirst cf=new ChildGoFirst();
		cf.engine();
		cf.guidelines();
		cf.bdyColor();
		}

	@Override
	public void bdyColor() {
		// TODO Auto-generated method stub
		System.out.println("Red color on the Back Side");
	}

}
