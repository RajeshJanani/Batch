package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.util.*;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/selectable");
		
		Select s1 = new Select(driver.findElement(By.className("custom-select")));
		s1.selectByVisibleText("Spain");
		
		List <WebElement> count = s1.getOptions();
		int size = count.size();
		System.out.println(size);
		
		for(int i=0; i<size ; i++)
		{
			String items = count.get(i).getText();
			System.out.println(items);
		}
		
	/*	WebElement drag = driver.findElement(By.id("dragBox"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(drag, 400, 400).build().perform();
		
		
		WebElement drag1 = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions act1 = new Actions(driver);
		act1.dragAndDrop(drag1, drop).build().perform();*/
		
	
	}

}
