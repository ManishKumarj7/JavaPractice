package com.manish.mindflur;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// java Program to check the number is prime or not
		
		int n=12;
		int flag=0;
		for(int i=2;i<=n/2;++i) {
			if(n %i==0) {
				flag= 1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("prime number");
		}
		else
		{
			System.out.println("Not Prime Number");
		}
	}

}
