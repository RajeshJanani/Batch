package mrng;

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
		
		WebElement search = driver.findElement(By.cssSelector("input#twotabsearchtextbox[type='text'][name='field-keywords']"));
		search.sendKeys("Mobile");		
		
		/*WebElement click = driver.findElement(By.id("nav-search-submit-button"));
		click.click();
		
		WebElement link1 = driver.findElement(By.linkText("Electronics"));
		link1.click();
		
		WebElement link2 = driver.findElement(By.partialLinkText("Best"));
		link2.click();
		
		System.out.println();*/
	}

}
