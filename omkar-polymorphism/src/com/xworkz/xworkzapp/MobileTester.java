package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.mobile.MobileDto;
import com.xworkz.xworkzapp.mobile.Nokiea1100;

public class MobileTester {
	
	public static void main(String[] args) {
		
		MobileDto noki = new Nokiea1100(); //casting parent to child
		
		noki.call();
		noki.message();
		
		//downcasting
		Nokiea1100 nok = (Nokiea1100)noki;
		nok.nokie();
		
	}

}
