package com.codegeekslab.app;

import com.codegeekslab.devices.BasicPhone;

public class CallingApp {

	private BasicPhone basicPhone;

	public CallingApp() {
		basicPhone = new BasicPhone();
	}

	public void dialNumber(int number) {
		basicPhone.makeCall(number);
	}

}
