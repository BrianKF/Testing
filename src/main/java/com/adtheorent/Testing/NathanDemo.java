package com.adtheorent.Testing;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class NathanDemo {

	
	
	@Test
	public void testFirefoxResettingDeviceTargetingSectionIsSuccessful() throws InterruptedException {
		DeviceTargeting myDevTargeting = new DeviceTargeting(new FirefoxDriver());
		myDevTargeting.resetDeviceCarrier();
	}
	
//	@Test
//	public void testChromeResettingDeviceTargetingSectionIsSuccessful() {
//		DeviceTargeting myDevTargeting = new DeviceTargeting(new ChromeDriver());
//	}
	
//	@Test
//	public void testResettingDeviceTargetingSectionIsSuccessful() {
//		DeviceTargeting myDevTargeting = new DeviceTargeting(false, false, true);
//	}
//	
}
