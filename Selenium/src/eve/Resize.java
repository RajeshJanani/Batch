package eve;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/resizable");
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"resizable\"]/span"));
				
		Actions ac = new Actions(driver);
		ac.clickAndHold(ele).moveByOffset(150, 200).perform();
	}

}
