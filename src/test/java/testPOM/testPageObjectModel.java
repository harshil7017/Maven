package testPOM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class testPageObjectModel {
	
WebDriver driver;
public testPageObjectModel(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
} 
//WebElement logins=driver.findElement(By.xpath("//div[@class='login-btn'][2]"));
//pagefactory
@FindBy(xpath="//div[@class='login-btn'][2]")
WebElement login;

public void loginapplication(String logins)
{
	login.sendKeys(logins);
	
}
public void goTo()
{
	driver.get("https://rahulshettyacademy.com/");
}
}
