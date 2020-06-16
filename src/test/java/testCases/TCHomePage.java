package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import base.Base;

public class TCHomePage extends Base {

	public WebDriver driver;
	
	
	@Test
	public void pageNavigation() throws IOException, InterruptedException{
		driver = initBrowser();
		HomePage hp = new HomePage(driver);
		Thread.sleep(5000);
		//hp.getDestination().sendKeys("Mumbai");	
		hp.getCheckIn().click();
	}
}
