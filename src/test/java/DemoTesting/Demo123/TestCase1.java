package DemoTesting.Demo123;

import java.net.MalformedURLException;


import org.openqa.selenium.WebDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageObject.AddToCartPage;
import PageObject.DesktopsPage;
import PageObject.HomePage;

public class TestCase1 extends BaseConfig {

	HomePage homeObj;
	DesktopsPage desktopObj;
	AddToCartPage addCartObj;
	WebDriver driver;
	@Parameters({"Port"})
	@BeforeMethod
	public void initializeSetup(String Port) throws MalformedURLException {
		driver = setup(Port);
		homeObj = new HomePage(driver);
		desktopObj = new DesktopsPage(driver);
		addCartObj = new AddToCartPage(driver);
	}
	@Test
	public void test1() {
		homeObj.checkHomePage();
		homeObj.navigateToDesktop();
		desktopObj.navigateToCart();
		addCartObj.checkAddToCart();
		
	}
}
