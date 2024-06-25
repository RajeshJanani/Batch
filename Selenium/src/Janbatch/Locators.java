package Janbatch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(500);
		
		WebElement name = driver.findElement(By.name("field-keywords"));
		name.sendKeys("watch");  // send keys is used to give the input to the textbox
		//name.submit();
		
		WebElement search = driver.findElement(By.id("nav-search-submit-button"));
		search.click();
		
		WebElement link = driver.findElement(By.linkText("Electronics"));
		link.click();
		
		WebElement partial = driver.findElement(By.partialLinkText("Customer"));
		partial.click();
		
		List <WebElement> total = driver.findElements(By.tagName("a"));
		int num = total.size();
		System.out.println("Total Links:" + num);
		
		
	}
	
	
}
