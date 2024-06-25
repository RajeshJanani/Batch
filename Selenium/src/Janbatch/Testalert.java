package Janbatch;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testalert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/?m=1");
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[1]"));
		button.click();
		Alert a = driver.switchTo().alert();
		a.accept();
		
		Thread.sleep(3000);
		WebElement confirm = driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[2]"));
		confirm.click();
		Alert con = driver.switchTo().alert();
		String txt = con.getText();
		System.out.println(txt);
	//	System.out.println(con.getText());
		con.accept();
		
		Thread.sleep(3000);
		WebElement prompt = driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[3]"));
		prompt.click();
		Alert pro= driver.switchTo().alert();
		String text = pro.getText();
		System.out.println(text);
		pro.sendKeys("Hello");
		pro.accept();
		
		String txt3 = driver.findElement(By.id("demo")).getText();
		System.out.println(txt3);
		
	}

}
