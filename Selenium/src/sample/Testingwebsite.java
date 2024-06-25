package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testingwebsite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f1 = new File("C:\\Users\\LOVELY\\git\\second\\Selenium\\or1.properties");
		FileInputStream fi =new FileInputStream(f1);
		Properties pro = new Properties();
		pro.load(fi);
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		
		driver.get(pro.getProperty("url"));
		
		driver.findElement(By.xpath(pro.getProperty("login"))).click();
		
		WebElement user = driver.findElement(By.xpath(pro.getProperty("username")));
		
		user.sendKeys(pro.getProperty("uservalue"));
		
		WebElement passw = driver.findElement(By.xpath(pro.getProperty("password")));
		
		passw.sendKeys(pro.getProperty("pass"));
		
		WebElement button = driver.findElement(By.xpath(pro.getProperty("loginbutton")));
		
		button.click();
	}

}
