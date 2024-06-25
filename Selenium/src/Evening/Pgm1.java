package Evening;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pgm1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Selenium");
		search.submit();
		
	/*	String title = driver.getTitle();
		System.out.println("Title : " + title);
		
		String url = driver.getCurrentUrl();
		System.out.println("URL : " + url);
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.navigate().back();*/
		
		Thread.sleep(3000);
		
		WebElement link = driver.findElement(By.xpath("//h3[text()='Selenium']"));
		link.click();
	}

}
