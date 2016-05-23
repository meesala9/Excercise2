package WebPageScreens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage {
	
	WebDriver driver;
	By Error_text = By.xpath("//*/div[@class='entry-content']");
	By Continue_button = By.xpath("//*/span[text()='Continue']"); 
	By Email = By.xpath("//*[@title='billingemail']");
	By FirstName = By.xpath("//*[@title='billingfirstname']");
	By LastName = By.xpath("//*[@title='billinglastname']");
	By Address = By.xpath("//*[@title='billingaddress']");
	By City = By.xpath("//*[@title='billingcity']");
	By Country = By.xpath("//*[@title='billingcountry']");
	By Phone = By.xpath("//*[@title='billingphone']");
	By PostalCode = By.xpath("//*[@title='billingpostcode']");
	By Address_CheckBox = By.xpath("//*[@id='shippingSameBilling']");
	By Purchase = By.xpath("//*/input[@value='Purchase']");
		
	public CheckOutPage(WebDriver driver){
		this.driver = driver;
	}
	public String getErrorText(){
		return driver.findElement(Error_text).getText();
	}
	
	public void setEmail(String strEmail){
		driver.findElement(Email).sendKeys(strEmail);
	}
	
	public void setFirstName(String strFirstName){
		driver.findElement(FirstName).sendKeys(strFirstName);
	}
	
	public void setLastName(String strLastName){
		driver.findElement(LastName).sendKeys(strLastName);
	}
	
	public void setAddress(String strAddress){
		driver.findElement(Address).sendKeys(strAddress);
	}
	public void setCity(String strCity){
		driver.findElement(City).sendKeys(strCity);
	}
	public void setCountry(String strCountry){
		Select dropDown = new Select(driver.findElement(Country));
		dropDown.selectByValue(strCountry);
	}
	public void setPostalCode(String strPostalCode){
		driver.findElement(PostalCode).sendKeys(strPostalCode);
	}
	public void setPhoneNumber(String strPhoneNumber){
		driver.findElement(Phone).sendKeys(strPhoneNumber);
	}
	public void setSameBillingAddressCheckbox(){
		if(!driver.findElement(Address_CheckBox).isSelected())
			driver.findElement(Address_CheckBox).click();
	}
	public void clickPurchase(){
		driver.findElement(Purchase).click();
	}
	public void clickContinueButton(){
		driver.findElement(Continue_button).click();
	}
	
}
