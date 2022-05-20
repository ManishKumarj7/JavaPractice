package com.manish.mindflur;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Date d=new Date();
//System.out.println(d.toString());
SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy");
System.out.println(sdf.format(d));
	}

}
