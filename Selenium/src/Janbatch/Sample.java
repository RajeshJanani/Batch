package Janbatch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		Select s1 = new Select(driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/select")));
		s1.selectByVisibleText("Spain");
		
		List < WebElement > count = s1.getOptions();
		int items = count.size();
		System.out.println(items);
		for(int i=0; i<items; i++)
		{
			String options = count.get(i).getText();
			System.out.println(options);
		}
		
		
	}

}
