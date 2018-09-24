package DealExchangeUI.UIPageAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DigitalDeal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://10.150.5.101:8080/DealExchangeUI-V2/login");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("MGopalan@opendealerexchange.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("KannanHome29");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text() ='Digital Deal']")).click();
		driver.findElement(By.xpath("//button[@class='search-button button-blue md-trigger']")).click();
		driver.findElement(By.xpath("//input[@name='dmsDealID']")).sendKeys("09041151");
		driver.findElement(By.xpath("//button[text()='Search ' and @class ='btn button-blue']")).click();
		driver.findElement(By.xpath("//a[@class='edocs-link' and text()='Pending']")).click();
	}

}
	
