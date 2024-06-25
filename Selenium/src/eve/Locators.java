package eve;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		
		search.sendKeys("Watches");
		
	/*	WebElement cli = driver.findElement(By.id("nav-search-submit-button"));
		cli.click();
		
		WebElement link = driver.findElement(By.linkText("Customer Service"));
		link.click();
		
		WebElement par = driver.findElement(By.partialLinkText("Elect"));
		par.click();
		
				
		List<WebElement> total = driver.findElements(By.tagName("input"));
		int tot = total.size();
		System.out.println(tot);
		
		driver.quit();*/
	}

}
