package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.name("field-keywords"));
		search.sendKeys("Mobiles");
		
		WebElement click = driver.findElement(By.id("nav-search-submit-button"));
		click.click();
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		WebElement link = driver.findElement(By.linkText("Electronics"));
		link.click();
		
		WebElement partial = driver.findElement(By.partialLinkText("Home &"));
		partial.click();
		
		driver.navigate().to("https://www.amazon.in/");
		
		List<WebElement> collections = driver.findElements(By.tagName("a"));
		int size=collections.size();
		System.out.println("Total Links : " + size);
		
		WebElement saleimg = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div/div[2]/a/div/img"));
		saleimg.click();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id=\"nav-cart-count-container\"]/span[2]")).click();
		
	}

}
