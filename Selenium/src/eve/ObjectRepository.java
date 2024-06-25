package eve;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepository {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		
		File fi = new File("C:\\Users\\LOVELY\\git\\second\\Selenium\\conf.properties");
		FileInputStream fis = new FileInputStream(fi);
		Properties pro = new Properties();
		pro.load(fis);
		
		driver.get(pro.getProperty("url"));
		
		WebElement lo = driver.findElement(By.xpath(pro.getProperty("login")));
		lo.click();
		
		WebElement user = driver.findElement(By.xpath(pro.getProperty("username")));
		user.sendKeys(pro.getProperty("uservalue"));
		WebElement pass = driver.findElement(By.xpath(pro.getProperty("password")));
		pass.sendKeys(pro.getProperty("passvalue"));
		
		WebElement but = driver.findElement(By.xpath(pro.getProperty("button")));
		but.click();
		
	}

}
