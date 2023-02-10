package testMaven;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Standalonetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Mens Tshirts");
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
		List<WebElement>products=driver.findElements(By.xpath("//div[@class='product-productMetaInfo']"));
		WebElement prod=products.stream().filter(product->
		product.findElement(By.cssSelector("h3")).getText().equals("HRX by Hrithik Roshan")).findFirst().orElse(null);
		System.out.println(prod.findElement(By.cssSelector("h3")).getSize());
	
	}

}
