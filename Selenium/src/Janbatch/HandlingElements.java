package Janbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		
		WebElement name = driver.findElement(By.id("userName"));
		name.sendKeys("Janani");
		//name.clear();
		System.out.println("the value of type is : " + name.getAttribute("type"));
		System.out.println("the value of type is : " + name.getAttribute("id"));
		
		String txt = name.getAttribute("value");
		
		if(txt.contains("Janani"))
			System.out.println("Correct text");
		else
			System.out.println("Incorrect");
		
		String text = driver.findElement(By.id("submit")).getText();
		System.out.println(text);
		
	}

}
