package example1;

import org.openqa.selenium.WebDriver;

public class HomePage{

WebDriver driver;

String siteUrl = "http://www.vpl.ca";

public HomePage(WebDriver driver)
{
this.driver = driver;
driver.get(siteUrl);
}

public String getTitle()
{

return driver.getTitle();


}

}
