package Evening;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe  ");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	/*	driver.get("https://demoqa.com/dragabble");
		
		WebElement drag = driver.findElement(By.id("dragBox"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDropBy(drag, 300, 200).build().perform();*/
		
		
		driver.get("https://demoqa.com/droppable");
		
		WebElement drag = driver.findElement(By.id("draggable"));
				
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(drag, drop).build().perform();
		
	}

}
