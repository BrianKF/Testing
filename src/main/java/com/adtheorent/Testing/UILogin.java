package com.adtheorent.Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UILogin {
	
	public static void login (WebDriver driver, String username, String password) {

	System.out.println("Logging into the UI.");
    driver.get("http://uatplatformv2.adtheorent.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.findElement(By.xpath(".//*[@id='txtLoginID']")).sendKeys(username);
    driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys(password);
    driver.findElement(By.xpath(".//*[@id='frmLogin']/p/button")).click();
	
	}

}
