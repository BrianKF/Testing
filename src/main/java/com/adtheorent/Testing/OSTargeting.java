package com.adtheorent.Testing;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OSTargeting {

	public static void DeviceOSTargeting() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
    	System.out.println("Launching OSTargeting Script");
    	System.out.println("Launching Firefox Web Browser");

    	//Calls UILogin class
        UILogin.login(driver, "Brian.Frazier@adtheorent.com", "AdTheorent155");
        driver.navigate().to("http://uatplatformv2.adtheorent.com/Strategy/Manage/%5EW9k$T00!mlkPTEyOTgm%5EGlp$D02Mzk=");
        
        //Set Targeting to OS Only
    	System.out.println("Setting Targeting to OS Only");
        driver.findElement(By.xpath(".//*[@id='lnkDevice']/i")).click();
        Thread.sleep(8000);
        Boolean isPresent = driver.findElement(By.xpath(".//*[@id='chkallOs']")).isDisplayed();
        if (isPresent == false)
        {
            System.out.println("Hmmm... It appears the detail view isn't opened.  Now opening.");
        	driver.findElement(By.xpath(".//*[@id='show_device_detailed']")).click();
        	}

//    	}
        Thread.sleep(5000);       

        driver.findElement(By.xpath(".//*[@id='divOs']/div[11]/label/input")).click();
        driver.findElement(By.xpath(".//*[@id='divOs']/div[1]/label/input")).click();
        driver.findElement(By.xpath(".//*[@id='divModalDevice']/div/div/div[3]/button[1]")).click();
        
        //Confirmiong Settings
    	System.out.println("Confirming Settings");
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.id("spanOsVersion"));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertEquals("Android(1.5,1.5,1.6,1.6,2.1),iOS(5,5,6,6,4);", strng);
        
        Thread.sleep(2000);
        driver.quit();
        
	}
}