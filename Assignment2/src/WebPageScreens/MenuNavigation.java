package WebPageScreens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class MenuNavigation {
	WebDriver driver;
	
	By MenuHome = By.xpath("//*[@id='menu-main-menu']/li");
	By MenuPhoneCategory = By.xpath("//*[@id='menu-main-menu']/li[2]/a");
	By MenuAllProducts = By.xpath("//*[@id='menu-main-menu']/li[4]/a");
	
	public MenuNavigation(WebDriver driver){
        this.driver = driver;
    }
	
	public void selectPhoneCategory(String strCategory){
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(MenuPhoneCategory)).perform();
		driver.findElement(By.linkText(strCategory)).click();
	}
	
	public void selectHome(){
		driver.findElement(MenuHome).click();
	}
	
	public void selectAllProducts(){
		driver.findElement(MenuAllProducts).click();
	}
}
