package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	By destination = By.xpath(" //div[@id='select2-drop']/div/input");
	By checkIn = By.cssSelector("input[name='checkin']");
	
	
	public WebElement getDestination(){
		return driver.findElement(destination);
	}
	public WebElement getCheckIn(){
		return driver.findElement(checkIn);
	}
	
	
	
	
}
