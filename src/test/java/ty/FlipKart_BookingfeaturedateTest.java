package ty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FlipKart_BookingfeaturedateTest {

	@Test
	public void ticketBooking() throws InterruptedException {
		WebDriver d = new ChromeDriver();
		Actions as = new Actions(d);

		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
		d.findElement(By.xpath("//button[.='✕']")).click();
		d.findElement(By.linkText("Travel")).click();

		WebElement depart = d.findElement(By.name("0-departcity"));
		WebDriverWait w = new WebDriverWait(d, 20);
		w.until(ExpectedConditions.elementToBeClickable(depart));
		Thread.sleep(2000);

		d.findElement(By.name("0-departcity")).sendKeys("bangalore");
		Thread.sleep(2000);

		WebElement departcity = d.findElement(By.xpath("//div[text()='BLR']"));
		as.click(departcity).perform();

		d.findElement(By.name("0-arrivalcity")).sendKeys("sin");

		WebElement arrivalcity = d.findElement(By.xpath("//div[text()='SIN']"));
		as.click(arrivalcity).perform();

		d.findElement(By.name("0-datefrom")).click();
		Thread.sleep(2000);
		for (;;) {
			try {
				// d.findElement(By.xpath("//div[text()='February 2022']/../../../../..//button[text()='22']")).click();
				d.findElement(By.xpath("//div[text()='November 2022']/following::button[text()='22']")).click();
				break;
			} catch (Exception e) {
				d.findElement(By.xpath("//div[@class='_3hsbax']")).click();
			}
		}
		// d.findElement(By.xpath("//button[text()='Done']")).click();
		// d.findElement(By.xpath("//span[.='SEARCH']")).click();

		Thread.sleep(5000);
		d.quit();

	}
}
