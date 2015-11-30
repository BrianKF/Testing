package com.adtheorent.Testing;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SmartPhoneTabletTargeting {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
    	System.out.println("Launching SmartPhoneTablet Tageting Script");
    	System.out.println("Launching Firefox Web Browser");
    	
    	//Calls UILogin class
        UILogin.login(driver, "Brian.Frazier@adtheorent.com", "AdTheorent155");
        driver.navigate().to("http://uatplatformv2.adtheorent.com/Strategy/Manage/%5EW9k$T00!mlkPTEyOTgm%5EGlp$D02Mzk=");
        
        driver.findElement(By.xpath(".//*[@id='lnkDevice']/i")).click();
        
        
      //Check to see if the device detail window is open, then resets all options
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
        Thread.sleep(5000);       
        driver.findElement(By.xpath(".//*[@id='chkbx_SelectAllTablets']")).click();
        driver.findElement(By.xpath(".//*[@id='chkbx_SelectAllSmartphones']")).click();
        driver.findElement(By.xpath(".//*[@id='chkTargetOs']")).click();
        
        
        driver.findElement(By.xpath(".//*[@id='Android_SmartPhone']")).click();
        driver.findElement(By.xpath(".//*[@id='Android_Tablet']")).click();
        driver.findElement(By.xpath(".//*[@id='Bada_SmartPhone']")).click();
        driver.findElement(By.xpath(".//*[@id='iOS_Tablet']")).click();
        driver.findElement(By.xpath(".//*[@id='divModalDevice']/div/div/div[3]/button[1]")).click();

        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath(".//*[@id='spandevice']"));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertEquals("All android smartphone, All android tablet, All bada smartphone, All ios tablet;", strng);
        

        Thread.sleep(2000);
        driver.quit();
	}

}
