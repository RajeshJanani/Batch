package mrng;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
	/*	WebElement label= driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]/label"));
		String txt = label.getText();
		System.out.println(txt);*/
		
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("RajeshJanani");
		
	/*	String text = name.getAttribute("value");
		System.out.println(text);
		
		if (text.isEmpty())
			System.out.println("true");
		else
			System.out.println("false");
		
		name.clear();*/
		
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Submit']"));
		button.click();
		
	Point loc = button.getLocation();
		int x= loc.getX();
		int y = loc.getY();
		
		System.out.println(x + " " + y);
		
		
		String bgcolor = button.getCssValue("background-color");
		String txtcolor = button.getCssValue("color");
		
		System.out.println("Background : " + bgcolor + "  " + "Text color " + txtcolor);
		
		
		int height = button.getSize().getHeight();
		int width = button.getSize().getWidth();
		
		System.out.println(height + "  " + width);
		
		
		
		
		
		
		
		
		
		
	}

}
