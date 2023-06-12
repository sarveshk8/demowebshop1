package DemoTesting.Demo123;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObject.AddToCart;
import PageObject.CompMenu;
import PageObject.DemoHome;

public class TestCaseDemo extends BaseConfigDemo{
	
	public DemoHome demoObj;
    public CompMenu compmenuobj;
    public AddToCart addtocartobj;

    WebDriver driver;

    @BeforeClass
    public void setup(){

        driver = getDemoDriver();
        demoObj = new DemoHome(driver);
        compmenuobj = new CompMenu(driver);
        addtocartobj = new AddToCart(driver);

    }

    @Test
    public void Scenario(){
        demoObj.verifyDisply();
        compmenuobj.CompNavi();
        addtocartobj.addcart();

    }
	

}
