package Evening;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe  ");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Janani");
		
		Select s1 = new Select(driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/select")));
		s1.selectByVisibleText("Spain");
		
		List <WebElement> elementCount = s1.getOptions();
        int itemSize = elementCount.size();
        System.out.println(" The Number of Items :" + itemSize);
        for(int i = 0; i < itemSize ; i++)
        {
            String optionsValue = elementCount.get(i).getText();
            System.out.println(optionsValue);
           
    	}

		
	}

}
