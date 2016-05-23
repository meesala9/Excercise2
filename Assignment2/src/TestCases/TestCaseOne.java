package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import WebPageScreens.CheckOutPage;
import WebPageScreens.HomePage;
import WebPageScreens.MenuNavigation;
import WebPageScreens.PhoneProductsPage;
import WebPageScreens.TransactionPage;

public class TestCaseOne {
	
	public static void main(String[] args){
	
		WebDriver driver = new FirefoxDriver();
		driver.get("http://store.demoqa.com");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        
		HomePage home = new HomePage(driver);
		String homePageTitle = home.GetHomePageTitle();
		System.out.println("HomePage Title : "+homePageTitle);
		
		MenuNavigation navigation = new MenuNavigation(driver);
		navigation.selectPhoneCategory("iPhones");
		
		PhoneProductsPage productsPage = new PhoneProductsPage(driver);
		String iPhoneCost = productsPage.getiPhoneBlackPrice();
		System.out.println("Black iPhone 4s Cost : "+iPhoneCost);
		productsPage.iPhone4sBlack_AddtoCart();
		productsPage.clickOnCheckOut();
		
		CheckOutPage checkout = new CheckOutPage(driver);
		checkout.clickContinueButton();
		checkout.setEmail("test@gmail.com");
		checkout.setFirstName("Test First Name");
		checkout.setLastName("Test Last Name");
		checkout.setAddress("Test Address");
		checkout.setCity("Sacramento");
		checkout.setCountry("US");
		checkout.setPhoneNumber("+1 9165777777");
		checkout.setSameBillingAddressCheckbox();
		checkout.clickPurchase();
		
		TransactionPage transaction = new TransactionPage(driver);
		String totalAtCheckout = transaction.getItemTotal();
		System.out.println("Black iPhone 4s Cost at Checkout : "+totalAtCheckout);
		
		
		if(iPhoneCost.equalsIgnoreCase(totalAtCheckout)){
			System.out.println("\n\n****Costs are same****");
		}
		driver.close();
	}
}
