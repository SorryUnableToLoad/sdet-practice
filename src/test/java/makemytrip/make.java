package makemytrip;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class make {
	WebDriver driver;

	@Test
	public void run() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		JavascriptExecutor j = (JavascriptExecutor) driver;
		Actions a = new Actions(driver);
		WebElement from = driver.findElement(By.xpath("//span[text()='From']"));
		a.moveToElement(from).doubleClick(from).perform();
		driver.findElement(By.xpath("//span[text()='From']")).click();
		driver.findElement(By.xpath("//p[text()='Bangalore, India']")).click();
		driver.findElement(By.xpath("//span[text()='To']")).click();

		WebElement goa = driver.findElement(By.xpath("//p[text()='Goa, India']"));
		j.executeScript("arguments[0].click();", goa);

		WebElement deptdate = driver.findElement(By.xpath("//span[text()='DEPARTURE']"));
		a.moveToElement(deptdate).click(deptdate).perform();
		WebElement date = driver.findElement(By.xpath("//div[@aria-label='Fri  31 2021']/div/p"));
		a.moveToElement(date).click(date).perform();

		driver.findElement(By.xpath("//a[text()='Search']")).click();
		j.executeScript("window.scrollTo(0,document.body.scrollHeight)");

		List<WebElement> name = driver.findElements(By.xpath("//span[@class='boldFont blackText airlineName']"));
		List<WebElement> time = driver.findElements(By.xpath("//p[text()='Bengaluru']/../p[1]/span"));
		int no = name.size();
		int no1 = time.size();
		System.out.println(no);
		System.out.println(no1);
		for (int i = 0; i < no; i++) {
			String flightName = name.get(i).getText();
			String ti = time.get(i).getText();
			System.out.println(flightName + "------------->" + ti);

		}
		driver.close();
	}

}
