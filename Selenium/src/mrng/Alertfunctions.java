package mrng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertfunctions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/?m=1");
		
		WebElement simple = driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[1]"));
		
		simple.click();
		Thread.sleep(3000);
		Alert sim = driver.switchTo().alert();
		
		sim.accept();
		
		Thread.sleep(3000);
		WebElement confirm = driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[2]"));
		confirm.click();
		Alert conf = driver.switchTo().alert();
		Thread.sleep(3000);
		String text = conf.getText();
		System.out.println(text);
		conf.dismiss();
		
		Thread.sleep(3000);
		WebElement prompt = driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[3]"));
		prompt.click();
		Alert pro = driver.switchTo().alert();
		Thread.sleep(3000);
		pro.sendKeys("Janani");
		pro.accept();
		
	}

}
