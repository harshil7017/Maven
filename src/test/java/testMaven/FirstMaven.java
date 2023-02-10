package testMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FirstMaven {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//div/a")).click();
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9839383938");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Reset Login']")).click();
		System.out.println(driver.findElement(By.xpath("//form/p[@class='infoMsg']")).getText());
		driver.findElement(By.xpath("//div/button[@class=\"go-to-login-btn\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//form/input[@id='inputUsername']")).click();
		driver.findElement(By.xpath("//form/input[@id='inputUsername']")).sendKeys("rahul");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//form/input[@name='inputPassword']")).sendKeys("rahulshettyacademy");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		Thread.sleep(5000);
		Assert.assertEquals(driver.findElement(By.xpath("//p[@class='error']")).getText(),"* Incorrect username or password");
		Thread.sleep(5000);
	
	}

}
