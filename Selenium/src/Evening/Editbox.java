package Evening;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Editbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("janani");
		
		String txt = name.getAttribute("value");
		System.out.println(txt);
		
		WebElement submit = driver.findElement(By.name("submit"));
		
		Point loc = submit.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		System.out.println(x + " " + y);
		
		String bgcolor = submit.getCssValue("background-color");
		String txtcolor = submit.getCssValue("color");
		System.out.println(bgcolor);
		System.out.println(txtcolor);
		 
		int height = submit.getSize().getHeight();
		int width = submit.getSize().getWidth();
		System.out.println(height + "  "+ width);
	}

}
