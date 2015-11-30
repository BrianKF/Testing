package com.adtheorent.Testing;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DeviceTargeting {
	
	
	
	WebDriver driver;; // now this is an "instance" field / variable
	
	// instance fields / methods are only applicable to "instances" of an object, that is you have to create an instance of this class somewhere and use it
	// static fields / methods do not require the object to created... you can just use them, like this:
	// Static Approach:
	// DeviceTargeting.ResetDeviceTypes();
	// DeviceTargeting.ResetDeviceCarrier();
	// in this above example (your current implementation), each of these static methods creates a new WebDriver object, logs in, and walks through the application,
	// which is pretty slow and wasteful to recreate all those resources over and over again
	
	// your goal is reuse as much as possible, and build incremental objects / methods that let you navigate to where you need to do the most work
	
	
	// Instance Approach:
	// DeviceTargeting myDevTargetingObject = new DeviceTargeting(any params you want, or none, depending on your need);
	// myDevTargetingObject.resetDeviceTypes();
	// myDevTargetingObject.resetDeviceCarrier();
	
	// so another way to do it would be something like this (in your test):
	// you would have a constructor for the DeviceTargeting class, which would be responsible for creating the webdriver instance, and possibly navigating to where 
	// you needed to be to do your work in this device targeting area of the ui.
	// Then you would create methods that could be called that would reset each device type (like you've already done, but as instance methods)
	
	// default consturctor
	
	public DeviceTargeting(WebDriver myDriver) {
		driver = myDriver;
		
		// now we could have it navigate for us directly or through methods, either way is fine
		System.out.println("Launching ResetDeviceTypes Script");
    	System.out.println("Launching Firefox Web Browser");    	
    	// this below line is great! you have a parameterized method for logging in!
        UILogin.login(driver, "Brian.Frazier@adtheorent.com", "AdTheorent155");
        
        driver.navigate().to("http://uatplatformv2.adtheorent.com/Strategy/Manage/%5EW9k$T00!mlkPTEyOTgm%5EGlp$D02Mzk=");
	}
	
	// ok so now if we create an instance of this class externally we should navigate to this page! let's try
	
	public void resetAllDeviceTargeting() throws InterruptedException {
		resetDeviceTypes();
		resetDeviceCarrier();
		resetDeviceWifi();	
	}
	
	public void resetDeviceTypes() throws InterruptedException {
		//Resets Device configuration
//		WebDriver driver = new FirefoxDriver();
//    	System.out.println("Launching ResetDeviceTypes Script");
//    	System.out.println("Launching Firefox Web Browser");    	
//        UILogin.login(driver, "Brian.Frazier@adtheorent.com", "AdTheorent155");
//        driver.navigate().to("http://uatplatformv2.adtheorent.com/Strategy/Manage/%5EW9k$T00!mlkPTEyOTgm%5EGlp$D02Mzk=");
		Thread.sleep(5000);
		System.out.println("Looking for Device link...");
		Boolean isDevicePresent = driver.findElement(By.xpath(".//*[@id='lnkDevice']/i")).isDisplayed();
        if (isDevicePresent == true)
        {
            System.out.println("Minimizing Strategy Properties ");
        	driver.findElement(By.xpath("html/body/section/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div/a")).click();
        	}
        
		driver.findElement(By.xpath(".//*[@id='lnkDevice']/i")).click();
        System.out.println("Reseting Device configuration");
        Thread.sleep(8000);
        Boolean isPresent = driver.findElement(By.xpath(".//*[@id='chkallOs']")).isDisplayed();
        if (isPresent == false)
        {
            System.out.println("Hmmm... It appears the detail view isn't opened.  Now opening.");
        	driver.findElement(By.xpath(".//*[@id='show_device_detailed']")).click();
        	}
        WebElement SelectAll1;
        WebElement SelectAll2;
        WebElement TargetOS;
        SelectAll1 = driver.findElement(By.xpath(".//*[@id='chkbx_SelectAllTablets']"));
        SelectAll2 = driver.findElement(By.xpath(".//*[@id='chkbx_SelectAllSmartphones']"));
        TargetOS = driver.findElement(By.xpath(".//*[@id='chkTargetOs']"));
        if(!SelectAll1.isSelected()){
        	SelectAll1.click();
        }
        if(!SelectAll2.isSelected()){
        	SelectAll2.click();
        }
    	if(!TargetOS.isSelected()){
    		TargetOS.click();
    	}
        Thread.sleep(3000);       
        driver.findElement(By.xpath(".//*[@id='chkbx_SelectAllTablets']")).click();
        driver.findElement(By.xpath(".//*[@id='chkbx_SelectAllSmartphones']")).click();
        driver.findElement(By.xpath(".//*[@id='chkTargetOs']")).click();
        driver.findElement(By.xpath(".//*[@id='divModalDevice']/div/div/div[3]/button[1]")).click();
//      //Confirms test parameters are correct
//        System.out.println("Checking to make sure settings are correct");
//        Thread.sleep(5000);
//        WebElement element = driver.findElement(By.xpath("html/body/section/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[3]/table/tbody/tr/td[3]"));
//        String strng = element.getText();
//        System.out.println(strng);
//        
//        try {
//        	Assert.assertEquals("", strng);
//        } catch (AssertionError err) {
//        	System.out.println("Something went wrong.  Trying again...");
//        	System.out.println("");
//            driver.quit();
//        	ResetDeviceTypes();
//        }
        
        //Closing the browser
//        System.out.println("Closing the browser.  Test Complete");
//        Thread.sleep(5000);
//        driver.quit();
	}
        
	public void resetDeviceCarrier() throws InterruptedException {
//		WebDriver driver = new FirefoxDriver();
//    	System.out.println("Launching ResetDeviceCarrier Script");
//    	System.out.println("Launching Firefox Web Browser");    	
//        UILogin.login(driver, "Brian.Frazier@adtheorent.com", "AdTheorent155");
//        driver.navigate().to("http://uatplatformv2.adtheorent.com/Strategy/Manage/%5EW9k$T00!mlkPTEyOTgm%5EGlp$D02Mzk=");
        //Resets Carrier configuration
        Thread.sleep(5000);
        System.out.println("Reseting Carrier configuration");
		Boolean isDevicePresent = driver.findElement(By.xpath(".//*[@id='lnkDevice']/i")).isDisplayed();
        if (isDevicePresent == true)
        {
            System.out.println("Minimizing Strategy Properties ");
        	driver.findElement(By.xpath("html/body/section/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div/a")).click();
        	}
        driver.findElement(By.xpath(".//*[@id='lnkDevice']/i")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(".//*[@id='licarrier']/a")).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath(".//*[@id='carrier']/div[2]/div[2]/p[3]/a/i")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath(".//*[@id='divModalDevice']/div/div/div[3]/button[1]")).click();
        
//        //Confirms test parameters are correct
//        System.out.println("Checking to make sure settings are correct");
//        Thread.sleep(5000);
//        WebElement element2 = driver.findElement(By.xpath("html/body/section/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[3]/table/tbody/tr/td[3]"));
//        String strng2 = element2.getText();
//        System.out.println(strng2);
//        
//        try {
//        	Assert.assertEquals("", strng2);
//        } catch (AssertionError err) {
//        	System.out.println("Something went wrong.  Trying again...");
//        	System.out.println("");
//            driver.quit();
//            ResetDeviceCarrier();
//        }
        
        //Closing the browser
//        System.out.println("Closing the browser.  Test Complete");
//        Thread.sleep(5000);
//        driver.quit();
        // we don't want to close the driver anymore, because it's instance not static now
}
	public void resetDeviceWifi() throws InterruptedException {
//		WebDriver driver = new FirefoxDriver();
//    	System.out.println("Launching ResetDeviceWifi Script");
//    	System.out.println("Launching Firefox Web Browser");    	
//        UILogin.login(driver, "Brian.Frazier@adtheorent.com", "AdTheorent155");
//        driver.navigate().to("http://uatplatformv2.adtheorent.com/Strategy/Manage/%5EW9k$T00!mlkPTEyOTgm%5EGlp$D02Mzk=");
        //Resets Wifi configuration
        Thread.sleep(3000);
		Boolean isDevicePresent = driver.findElement(By.xpath(".//*[@id='lnkDevice']/i")).isDisplayed();
        if (isDevicePresent == true)
        {
            System.out.println("Minimizing Strategy Properties ");
        	driver.findElement(By.xpath("html/body/section/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div/a")).click();
        	}
        System.out.println("Reseting Wifi configuration");
        driver.findElement(By.xpath(".//*[@id='lnkDevice']/i")).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath(".//*[@id='liwifi']/a")).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath(".//*[@id='wifi']/div[2]/div[2]/p[3]/a")).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath(".//*[@id='divModalDevice']/div/div/div[3]/button[1]")).click();
        
        //Confirms test parameters are correct
        System.out.println("Checking to make sure settings are correct");
        Thread.sleep(5000);
        WebElement element = driver.findElement(By.xpath("html/body/section/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[3]/table/tbody/tr/td[3]"));
        String strng = element.getText();
        System.out.println(strng);
        
        try {
        	Assert.assertEquals("", strng);
        } catch (AssertionError err) {
        	System.out.println("Something went wrong.  Trying again...");
        	System.out.println("");
            driver.quit();
            resetDeviceWifi();
        }
        
        //Closing the browser
//        System.out.println("Closing the browser.  Test Complete");
//        Thread.sleep(5000);
//        driver.quit();
}
	

	public void deviceiPADOSiOSv9CarrierAttDevice() throws InterruptedException {
		//WebDriver driver = new FirefoxDriver();
//    	System.out.println("Launching DeviceiPADOSiOSv9CarrierAttDevice Method");
//    	System.out.println("Launching Firefox Web Browser");
//    	
//        UILogin.login(driver, "Brian.Frazier@adtheorent.com", "AdTheorent155");
//    	driver.navigate().to("http://uatplatformv2.adtheorent.com/Strategy/Manage/%5EW9k$T00!mlkPTEyOTgm%5EGlp$D02Mzk=");
  
    	// Sets Device to iPad
    	System.out.println("Setting Device to iPad");
		Boolean isDevicePresent = driver.findElement(By.xpath(".//*[@id='lnkDevice']/i")).isDisplayed();
        if (isDevicePresent == true)
        {
            System.out.println("Minimizing Strategy Properties ");
        	driver.findElement(By.xpath("html/body/section/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div/a")).click();
        	}
        driver.findElement(By.xpath(".//*[@id='lnkDevice']/i")).click();
        Thread.sleep(3000);
        System.out.println("Setting to Tablet");
        Thread.sleep(5000);
        driver.findElement(By.xpath(".//*[@id='iOS_Tablet']")).click();
        
        Boolean isPresent = driver.findElement(By.xpath(".//*[@id='chkallOs']")).isDisplayed();
        if (isPresent == false)
        {
            System.out.println("Hmmm... It appears the detail view isn't opened.  Now opening.");
        	driver.findElement(By.xpath(".//*[@id='show_device_detailed']")).click();
        	}
        
        Thread.sleep(3000);
        System.out.println("Setting to IOS 9");
        driver.findElement(By.xpath(".//*[@id='divOs']/div[12]/div[3]/i")).click();
        driver.findElement(By.xpath(".//*[@id='divOs']/div[12]/div[4]/div[1]/label/input")).click();
        driver.findElement(By.xpath(".//*[@id='divOs']/div[12]/div[4]/div[2]/label/input")).click();
        driver.findElement(By.xpath(".//*[@id='divOs']/div[12]/div[4]/div[3]/label/input")).click();
        driver.findElement(By.xpath(".//*[@id='divOs']/div[12]/div[4]/div[4]/label/input")).click();
        driver.findElement(By.xpath(".//*[@id='divOs']/div[12]/div[4]/div[5]/label/input")).click();
        driver.findElement(By.xpath(".//*[@id='divOs']/div[12]/div[4]/div[6]/label/input")).click();
        driver.findElement(By.xpath(".//*[@id='divOs']/div[12]/div[4]/div[7]/label/input")).click();
        driver.findElement(By.xpath(".//*[@id='divOs']/div[12]/div[4]/div[8]/label/input")).click();
        driver.findElement(By.xpath(".//*[@id='divOs']/div[12]/div[4]/div[10]/label/input")).click();
        driver.findElement(By.xpath(".//*[@id='divModalDevice']/div/div/div[3]/button[1]")).click();
        //Confirms test parameters are correct
        System.out.println("Checking to make sure settings are correct");
        Thread.sleep(5000);
        WebElement element = driver.findElement(By.id("spandevice"));
        String strng = element.getText();
        System.out.println(strng);
        
      //  Assert.assertEquals("Apple [iPad(T),iPad 2(T),iPad Air(T),iPad Air 2(T),iPad Air 2(T) ...];", strng);
        try {
        	Assert.assertEquals("Apple [iPad(T),iPad 2(T),iPad Air(T),iPad Air 2(T),iPad Air 2(T) ...];", strng);
        } catch (AssertionError err) {
        	System.out.println("Something went wrong.  Trying again...");
        	System.out.println("");
            driver.quit();
            deviceiPADOSiOSv9CarrierAttDevice();
        }
        
        //Closing the browser
//        System.out.println("Closing the browser.  Test Complete");
//        Thread.sleep(5000);
//        driver.quit();
	}   
        
	
	public void DeviceiPADOSiOSv9CarrierAttCarrier() throws InterruptedException {
//		//WebDriver driver = new FirefoxDriver();
//    	System.out.println("Launching DeviceiPADOSiOSv9CarrierAttCarrier Script");
//    	System.out.println("Launching Firefox Web Browser");
//    	
//        UILogin.login(driver, "Brian.Frazier@adtheorent.com", "AdTheorent155");
//    	driver.navigate().to("http://uatplatformv2.adtheorent.com/Strategy/Manage/%5EW9k$T00!mlkPTEyOTgm%5EGlp$D02Mzk=");
//        //Set up Carrier Details
        Thread.sleep(3000);
        System.out.println("Setting ATT as carrier");
        Thread.sleep(8000);
        driver.findElement(By.xpath(".//*[@id='lnkDevice']/i")).click();
        driver.findElement(By.xpath(".//*[@id='licarrier']/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(".//*[@id='carrier']/div[2]/div[2]/p[3]/a/i")).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath(".//*[@id='carrierSelect']/optgroup/option[9]")).click();
        driver.findElement(By.xpath(".//*[@id='carrier']/div[2]/div[2]/p[1]/a[1]/i")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(".//*[@id='carrierSelect']/optgroup/option[9]")).click();
        driver.findElement(By.xpath(".//*[@id='carrier']/div[2]/div[2]/p[1]/a[1]/i")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='divModalDevice']/div/div/div[3]/button[1]")).click();
        
        //Confirms test parameters are correct 
        System.out.println("Checking to make sure settings are correct");
        Thread.sleep(5000);
        WebElement element = driver.findElement(By.id("spanCarriers"));  
        String strng = element.getText();
        System.out.println(strng);
 
        try {
        	Assert.assertEquals("att global network services llc,att;", strng);
        } catch (AssertionError err) {
        	System.out.println("Something went wrong.  Trying again...");
        	System.out.println("");
            driver.quit();
            DeviceiPADOSiOSv9CarrierAttCarrier();
        }
        
        //Closes browser and ends test
//        Thread.sleep(2000);
//        System.out.println("Closing the browser.  Test Complete");
//        driver.quit();
	}
	
    	public void DeviceiPADOSiOSv9CarrierAttWifi() throws InterruptedException {
//    	WebDriver driver = new FirefoxDriver();
//        System.out.println("Launching DeviceiPADOSiOSv9CarrierAttWifi Script");
//        System.out.println("Launching Firefox Web Browser");
//        UILogin.login(driver, "Brian.Frazier@adtheorent.com", "AdTheorent155");
//        driver.navigate().to("http://uatplatformv2.adtheorent.com/Strategy/Manage/%5EW9k$T00!mlkPTEyOTgm%5EGlp$D02Mzk=");        
        //Resets Wifi configuration
        Thread.sleep(3000);
        System.out.println("Reseting Wifi configuration");
		Boolean isDevicePresent = driver.findElement(By.xpath(".//*[@id='lnkDevice']/i")).isDisplayed();
        if (isDevicePresent == true)
        {
            System.out.println("Minimizing Strategy Properties ");
        	driver.findElement(By.xpath("html/body/section/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div/a")).click();
        	}
        driver.findElement(By.xpath(".//*[@id='lnkDevice']/i")).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath(".//*[@id='liwifi']/a")).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath(".//*[@id='wifi']/div[2]/div[2]/p[3]/a")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath(".//*[@id='divModalDevice']/div/div/div[3]/button[1]")).click();

        //Confirms test parameters are correct
        System.out.println("Checking to make sure settings are correct");
        Thread.sleep(2000);
        WebElement element3 = driver.findElement(By.id("spanOsVersion"));
        String strng3 = element3.getText();
        System.out.println(strng3);
        Assert.assertEquals("iOS [9(T)];", strng3);
        
        //Closes browser and ends test
//        Thread.sleep(2000);
//        System.out.println("Closing the browser.  Test Complete");
//        driver.quit();
	}
	
    	
	public void deviceiPADOSiOSv9WifiComcastOS() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
    	System.out.println("Launching DeviceiPADOSiOSv9WifiComcast Script");
    	System.out.println("Launching Firefox Web Browser");
       
    	//Calls UILogin class
        UILogin.login(driver, "Brian.Frazier@adtheorent.com", "AdTheorent155");
        driver.navigate().to("http://uatplatformv2.adtheorent.com/Strategy/Manage/%5EW9k$T00!mlkPTEyOTgm%5EGlp$D02Mzk=");
//        
        
    	// Sets Device to iPad
        System.out.println("Setting Device to iPad and OS v9");
        Thread.sleep(3000);
		Boolean isDevicePresent = driver.findElement(By.xpath(".//*[@id='lnkDevice']/i")).isDisplayed();
        if (isDevicePresent == true)
        {
            System.out.println("Minimizing Strategy Properties ");
        	driver.findElement(By.xpath("html/body/section/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div/a")).click();
        	}
        driver.findElement(By.xpath(".//*[@id='lnkDevice']/i")).click();
        
        //Check to see if the device detail window is open, then resets all options
        Thread.sleep(8000);
        Boolean isPresent = driver.findElement(By.xpath(".//*[@id='chkallOs']")).isDisplayed();
        if (isPresent == false)
        {
            System.out.println("Hmmm... It appears the detail view isn't opened.  Now opening.");
        	driver.findElement(By.xpath(".//*[@id='show_device_detailed']")).click();
        	}
        
        Thread.sleep(5000);
        driver.findElement(By.xpath(".//*[@id='iOS_Tablet']")).click();
        driver.findElement(By.xpath(".//*[@id='divOs']/div[12]/div[3]/i")).click();
        driver.findElement(By.xpath(".//*[@id='divOs']/div[12]/div[4]/div[1]/label/input")).click();
        driver.findElement(By.xpath(".//*[@id='divOs']/div[12]/div[4]/div[2]/label/input")).click();
        driver.findElement(By.xpath(".//*[@id='divOs']/div[12]/div[4]/div[3]/label/input")).click();
        driver.findElement(By.xpath(".//*[@id='divOs']/div[12]/div[4]/div[4]/label/input")).click();
        driver.findElement(By.xpath(".//*[@id='divOs']/div[12]/div[4]/div[5]/label/input")).click();
        driver.findElement(By.xpath(".//*[@id='divOs']/div[12]/div[4]/div[6]/label/input")).click();
        driver.findElement(By.xpath(".//*[@id='divOs']/div[12]/div[4]/div[7]/label/input")).click();
        driver.findElement(By.xpath(".//*[@id='divOs']/div[12]/div[4]/div[8]/label/input")).click();
        driver.findElement(By.xpath(".//*[@id='divOs']/div[12]/div[4]/div[10]/label/input")).click();
        driver.findElement(By.xpath(".//*[@id='divModalDevice']/div/div/div[3]/button[1]")).click();
        Thread.sleep(5000);
        System.out.println("Done.  Closing...");
        
        System.out.println("Setting carrier to Comcast");
        //driver.findElement(By.xpath(".//*[@id='lnkDevice']/i")).click();
		Boolean isTheDevicePresent = driver.findElement(By.xpath(".//*[@id='lnkDevice']/i")).isDisplayed();
        if (isTheDevicePresent == true)
        {
            System.out.println("Minimizing Strategy Properties ");
        	driver.findElement(By.xpath("html/body/section/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div/a")).click();
        	}
        driver.findElement(By.xpath(".//*[@id='lnkDevice']/i")).click();
        System.out.println("Clicking wifi link");
        Thread.sleep(8000);
        driver.findElement(By.xpath(".//*[@id='liwifi']/a")).click();
//        System.out.println("Clearing selections");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath(".//*[@id='wifi']/div[2]/div[2]/p[3]/a/i")).click();
        System.out.println("Adding Selection");
        Thread.sleep(7000);
        driver.findElement(By.xpath(".//*[@id='wifiSelect']/optgroup/option[2016]")).click();
        Thread.sleep(12000);
        driver.findElement(By.xpath(".//*[@id='wifi']/div[2]/div[2]/p[1]/a[1]/i")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(".//*[@id='divModalDevice']/div/div/div[3]/button[1]")).click();
        
        //Confirms test parameters are correct
        System.out.println("Checking to make sure settings are correct");
//        WebElement element2 = driver.findElement(By.id("spanOsVersion"));
//        String strng2 = element2.getText();
//        System.out.println(strng2);
//        Assert.assertEquals("iOS [9(T)];", strng2);
        
//        WebElement element3 = driver.findElement(By.id("spanIsp"));
//        String strng3 = element3.getText();
//        System.out.println(strng3);
        //Assert.assertEquals("comcast telecommunications inc.", strng3);    
        
//        try {
//        	Assert.assertEquals("comcast telecommunications inc.", strng3);
//        } catch (AssertionError err) {
//        	System.out.println("Something went wrong.  Trying again...");
//        	System.out.println("");
//            driver.quit();
//            deviceiPADOSiOSv9WifiComcastWifi();
        }
        
//        //Closes browser and ends test
//        Thread.sleep(2000);
//        System.out.println("Closing the browser.  Test Complete");
//        driver.quit();
	//}
	
	public void DeviceBrandTargeting() throws InterruptedException {
//		WebDriver driver = new FirefoxDriver();
//		System.out.println("Launching DeviceBrandTargeting Script");
//		System.out.println("Launching Firefox Web Browser");    	
//	    UILogin.login(driver, "Brian.Frazier@adtheorent.com", "AdTheorent155");
//	    driver.navigate().to("http://uatplatformv2.adtheorent.com/Strategy/Manage/%5EW9k$T00!mlkPTEyOTgm%5EGlp$D02Mzk=");
	    
	    //Choosing Apple as the device
		Boolean isDevicePresent = driver.findElement(By.xpath(".//*[@id='lnkDevice']/i")).isDisplayed();
        if (isDevicePresent == true)
        {
            System.out.println("Minimizing Strategy Properties ");
        	driver.findElement(By.xpath("html/body/section/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div/a")).click();
        	}
	    driver.findElement(By.xpath(".//*[@id='lnkDevice']/i")).click();
	    System.out.println("Reseting Device configuration");
	    Thread.sleep(8000);
	    Boolean isPresent = driver.findElement(By.xpath(".//*[@id='chkallOs']")).isDisplayed();
	    if (isPresent == false)
	    {
	        System.out.println("Hmmm... It appears the detail view isn't opened.  Now opening.");
	    	driver.findElement(By.xpath(".//*[@id='show_device_detailed']")).click();
	    	}
	    System.out.println("Choosing Apple as the device");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath(".//*[@id='divDevice']/div[57]/label/input")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath(".//*[@id='divModalDevice']/div/div/div[3]/button[1]")).click();
	    
	    //Verifying Apple as the device
        System.out.println("Checking to make sure settings are correct");
	    System.out.println("Verifying Apple as the device");
	    Thread.sleep(2000);
	    WebElement element = driver.findElement(By.id("spandevice"));
	    String strng = element.getText();
	    System.out.println(strng);
	    Assert.assertEquals("iPhone,iPhone 3GS,iPhone 4,iPhone 4S,iPhone 5;", strng);
	    
	    
	    //Closing the browser
//	    System.out.println("Closing the browser.  Test Complete");
//	    Thread.sleep(2000);
//	    driver.quit();
	}
}