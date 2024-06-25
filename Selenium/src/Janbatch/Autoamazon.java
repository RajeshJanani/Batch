package Janbatch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoamazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe ");
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.name("field-keywords")).sendKeys("shoes");
		Thread.sleep(1500);
		List<WebElement> sug = driver.findElements(By.xpath("//*[@id=\"nav-flyout-searchAjax\"]/div[2]/div/div[1]/div"));
		int count = sug.size();
		System.out.println(count);
		for(WebElement e : sug)
		{
			System.out.println(e.getText());
		}
	}

}
