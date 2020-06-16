package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import base.Base;

public class TCHomePage extends Base {

	public WebDriver driver;
	
	
	@Test
	public void pageNavigation() throws IOException, InterruptedException{
		driver = initBrowser();
	
		HomePage hp = new HomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='select2-drop']/div/input")));
		hp.getDestination().sendKeys("mum");
		hp.getDestination().sendKeys(Keys.ENTER);
		hp.getCheckIn().click();
	}
}
