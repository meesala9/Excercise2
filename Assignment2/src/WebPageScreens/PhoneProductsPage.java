package WebPageScreens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PhoneProductsPage {
	WebDriver driver;
	By Checkout = By.linkText("Checkout");
	By iPhone_black_cost = By.xpath("//*/span[@class = 'currentprice pricedisplay product_price_96']");
	By iPhone_black_AddtoCart = By.xpath("//*/div[@class='default_product_display product_view_96 iphones group']/div[2]/form/div[2]/div[1]/span/input[@value='Add To Cart']");
	By continue_shopping = By.xpath("//*/a[@class='continue_shopping']");
	By Check_out = By.xpath("//*/a[@class='go_to_checkout']");
	
	public PhoneProductsPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void clickCheckoutButton(){
		driver.findElement(Checkout).click();
	}
	
	public void iPhone4sBlack_AddtoCart(){
		driver.findElement(iPhone_black_AddtoCart).click();
	}
	public String getiPhoneBlackPrice( ){
		return driver.findElement(iPhone_black_cost).getText();
	}
	
	public void clickOnContinueShopping(){
		driver.findElement(continue_shopping).click();
	}
	public void clickOnCheckOut(){
		driver.findElement(Check_out).click();
	}
}
