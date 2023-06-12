package PageObject;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoHome {
	
	WebDriver driver;
    public DemoHome(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//img[@alt='Tricentis Demo Web Shop']")
    WebElement logo;

    @FindBy(xpath = "//a[text()='Register']")
    WebElement regi;

    @FindBy(xpath = "//a[text()='Log in']")
    WebElement login;

    @FindBy(xpath = "//span[text()='Shopping cart']")
    WebElement cart;

    @FindBy(xpath = "//span[text()='Wishlist']")
    WebElement wishlist;
    
    public void verifyDisply(){

        logo.isDisplayed();
        Assert.assertTrue(logo.isDisplayed());

        regi.isDisplayed();
        Assert.assertTrue(regi.isDisplayed());

        login.isDisplayed();
        Assert.assertTrue(login.isDisplayed());

        cart.isDisplayed();
        Assert.assertTrue(cart.isDisplayed());

        wishlist.isDisplayed();
        Assert.assertTrue(wishlist.isDisplayed());
    }

}
