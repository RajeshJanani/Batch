package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("/html/body/div[3]/div/span")).click();
		
		driver.findElement(By.name("q")).sendKeys("shoes");
		
		List<WebElement> sug = driver.findElements(By.xpath("//div[@class='YGcVZO _2VHNef']"));
		
		for(WebElement e : sug)
		{
			System.out.println(e.getText());
		}
	}

}
