package mrng;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/Login");
		
		WebElement login = driver.findElement(By.name("login"));
		Point loc = login.getLocation();
		int x= loc.getX();
		int y = loc.getY();
		
		System.out.println(x + " " + y);
		
		
		String bgcolor = login.getCssValue("background-color");
		String txtcolor = login.getCssValue("color");
		
		System.out.println("Background : " + bgcolor + "  " + "Text color " + txtcolor);
		
		
		int height = login.getSize().getHeight();
		int width = login.getSize().getWidth();
		
		System.out.println(height + "  " + width);
}
}