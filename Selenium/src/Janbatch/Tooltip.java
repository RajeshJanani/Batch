package Janbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://jqueryui.com/tooltip/");
		Thread.sleep(1500);
		WebElement fr = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(fr);
		WebElement tip = driver.findElement(By.xpath("/html/body/p[4]/input"));
		String txt = tip.getAttribute("title");
		System.out.println(txt);
	/*	driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		driver.findElement(By.xpath("//*[@id=\"hobbies\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"practiceForm\"]/div[7]/div/div/div[2]/input")).click();
		driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
		Actions act = new Actions(driver);
		WebElement login = driver.findElement(By.xpath("//*[@id=\"collapseTwo\"]/div/ul/li[2]/a"));
		act.moveToElement(login).click().build().perform();
		driver.findElement(By.id("firstname")).sendKeys("janani");
		driver.findElement(By.id("lastname")).sendKeys("Rajesh");
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("janani@gmail.com");
		String username = user.getAttribute("value");
		WebElement pass =driver.findElement(By.id("password"));
		pass.sendKeys("jana@123");
		String pass1=pass.getAttribute("value");
		driver.findElement(By.xpath("//*[@id=\"signupForm\"]/div[5]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"signupForm\"]/div[5]/a")).click();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(pass1);
		driver.findElement(By.xpath("//*[@id=\"signInForm\"]/div[3]/input")).click();*/
		
	}

}
