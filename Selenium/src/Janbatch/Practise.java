package Janbatch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
	/*	WebElement gender = driver.findElement(By.xpath("//input[@id='female']"));
		gender.click();
		
		WebElement week1 = driver.findElement(By.id("wednesday"));
		week1.click();
		
		WebElement week2 = driver.findElement(By.id("friday"));
		week2.click();*/
		
		Select s1 = new Select(driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/select")));
		s1.selectByVisibleText("Italy");
		
		List < WebElement> count = s1.getOptions();
		int num = count.size();
		System.out.println(num);
		
		for(int i=0; i<num ; i++)
		{
			String opt = count.get(i).getText();
			System.out.println(opt);
		}
		
		
	}

}
