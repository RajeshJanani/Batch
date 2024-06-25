package Evening;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorssample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.name("field-keywords"));
		search.sendKeys("Mobile");
		
		WebElement button = driver.findElement(By.id("nav-search-submit-button"));
		button.click();
		
		driver.navigate().back();
		
		WebElement link = driver.findElement(By.linkText("Electronics"));
		link.click();
		
		WebElement partial = driver.findElement(By.partialLinkText("Customer"));
		partial.click();
		
		driver.navigate().to("https://www.amazon.in/");
		
		List <WebElement> alllink = driver.findElements(By.tagName("a"));
		int number = alllink.size();
		System.out.println(number);
		
		WebElement img = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div/div[2]/a/div/img"));
		img.click();
		
		
	}

}
