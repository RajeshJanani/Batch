package eve;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Webelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
	/*	WebElement button = driver.findElement(By.name("submit"));
		button.click();
		
		Point location = button.getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println(x + "  " + y);
		
		String back = button.getCssValue("background-color");
		String text = button.getCssValue("color");
		System.out.println(back + "  " + text);
		
		int height = button.getSize().getHeight();
		int width = button.getSize().getWidth();
		
		System.out.println(height + "  "+ width);*/
		
		Select se = new Select(driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/select")));
		
		se.selectByValue("2");
		
		List<WebElement > opt = se.getOptions();
		int number = opt.size();
		System.out.println(number);
		
		for(int i=1; i<= number;i++)
		{
			String options=opt.get(i).getText();
			System.out.println(options);
		}
	}

}
