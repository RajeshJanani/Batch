package sample;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Welcome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://activitysheet.ideatec.co.in/Base.aspx");
		Thread.sleep(1500);
		
	/*(	String title = driver.getTitle();
		System.out.println("Title : " + title);
		
		String url = driver.getCurrentUrl();
		System.out.println("Current Url : " + url);
		
		driver.navigate().to("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		driver.close();
		*/
	/*	WebElement name = driver.findElement(By.name("q"));
		name.sendKeys("Selenium");
		
		String txt = name.getAttribute("Value");
		System.out.println(txt);
		
		/*WebElement link1 = driver.findElement(By.xpath("//h3[text()='Selenium']"));
		link1.click();
		
		WebElement link2 = driver.findElement(By.xpath("//span[text()='Downloads']"));
		link2.click();*/
		
	/*	WebElement but = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/button"));
		Point loc = but.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		
		System.out.println("x is : " + x + "Y is : " + y);
		
		WebElement but1 = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/button"));
		String bgcolor = but1.getCssValue("background-color");
		String txtcolor = but1.getCssValue("color");
		System.out.println(bgcolor);
		System.out.println(txtcolor);

		WebElement but2 = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/button"));
		int height = but2.getSize().getHeight();
		int width = but2.getSize().getWidth();
		System.out.println(height + " " + width);*/
	}

}
