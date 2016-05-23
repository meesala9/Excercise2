package TestCases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import WebPageScreens.CheckOutPage;
import WebPageScreens.HomePage;

public class TestCaseThree {
	public static void main(String[] args){
		
		String ErrorMessage = "Oops, there is nothing in your cart.";
		WebDriver driver = new FirefoxDriver();
		driver.get("http://store.demoqa.com");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        
		HomePage home = new HomePage(driver);
		String homePageTitle = home.GetHomePageTitle();
		System.out.println("HomePage Title : "+homePageTitle);
		home.clickCheckoutButton();
		
		CheckOutPage checkout = new CheckOutPage(driver);
		String Error_meesage_onPage = checkout.getErrorText();
		if(ErrorMessage.equals(Error_meesage_onPage))
			System.out.println("\n\n\nPass: Error message exists on the screen");
		else
			System.out.println("\n\n\nFail: Error message doesn't exist on the screen");
		driver.close();
	}
}
