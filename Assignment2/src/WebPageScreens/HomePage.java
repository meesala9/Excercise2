package WebPageScreens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	By Checkout = By.xpath("//*/a[@title='Checkout']");
	
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	public String GetHomePageTitle(){
		return driver.getTitle();
	}
	public void clickCheckoutButton(){
		driver.findElement(Checkout).click();
	}
	
}
