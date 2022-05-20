package com.manish.Interface;

public class IndianTraffic implements Centraltraffic,ContinentalTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Centraltraffic ct=new IndianTraffic();
		ct.goGreen();
		ct.redStop();
		ct.flashYellow();
		ContinentalTraffic it=new IndianTraffic();
		it.getTrainSymbol();
	}

	@Override
	public void getTrainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("Get away from Railways Track");
	}

	@Override
	public void goGreen() {
		// TODO Auto-generated method stub
		System.out.println("You can go Now,:Happy Journey");

	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("please stop and follow traffic Rules");

	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("get ready to go");
	}

}
