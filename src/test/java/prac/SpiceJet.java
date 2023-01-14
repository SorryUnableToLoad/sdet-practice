package prac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SpiceJet {
	@Test
	public  void jet()throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notification");
		WebDriver driver = new ChromeDriver(option);
		//driver.get("https://www.spicejet.com/default.aspx");
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(3000);
		// From dropdown
		driver.findElement(By.xpath("//div[text()='From']")).click();
		driver.findElement(By.xpath("//div[text()='Bengaluru']")).click();
		// To Dropdown
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='To']")).click();
		driver.findElement(By.xpath("//div[text()='To']")).click();
		//driver.findElement(By.xpath("//div[@data-focusable='true']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Ajmer']")).click();
		//depart date
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='April ']/ancestor::div[@data-testid='undefined-calendar-picker']/descendant::div[text()='29']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[text()='Search Flight']")).click();
		driver.quit();
		
		

	}
}
