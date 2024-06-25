package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectSample {

	public static void main (String[] args) throws IOException
	{
		File s1 = new File("C:\\Users\\LOVELY\\git\\bat\\Selenium\\or.properties");
		FileInputStream fi =new FileInputStream(s1);
		Properties pro = new Properties();
		pro.load(fi);
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		
		driver.get(pro.getProperty("url"));
		
		WebElement sear = driver.findElement(By.xpath(pro.getProperty("search")));
		sear.sendKeys("Selenium");
		sear.submit();
		
		
	}
}
