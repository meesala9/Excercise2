package WebPageScreens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransactionPage {

	WebDriver driver;
	By ItemTotal = By.xpath("//*/table[@class='wpsc-purchase-log-transaction-results']/tbody/tr/td[4]");
	
	public TransactionPage(WebDriver driver){
		this.driver = driver;
	}
	
	public String getItemTotal(){
		return driver.findElement(ItemTotal).getText();
	}
}
