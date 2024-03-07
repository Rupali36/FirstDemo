package com.testingshastra;

import org.testng.annotations.Test;

public class ExcelDemo {
	@Test(dataProvider = "pincode_data",dataProviderClass = TestData.class)
	private void verifyThatErrormsgIsAbsentForValidPincode(String pincode) {
		System.out.println(pincode);
		
		

	}

}
