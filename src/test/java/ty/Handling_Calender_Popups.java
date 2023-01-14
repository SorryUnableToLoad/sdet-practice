package ty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Handling_Calender_Popups {
	@Test
	void calenderPopups() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.tripodeal.com/");
		driver.findElement(By.id("origin")).sendKeys("BLR");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='eac-item']/b[text()='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("destination")).sendKeys("DEL");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='eac-item']/b[text()='DEL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("dateNew")).click();
		Thread.sleep(2000);

		String[] caledar = getDate().split(" ");
		String date = caledar[0];
		String month = caledar[1];
		String year = caledar[2];
		System.out.println(date);
		System.out.println(month);
		System.out.println(year);

		/*
		 * String date = "25"; String month = "May"; String year = "2022";
		 */

		int i = 0;
		while (i <= 12) {
			try {
				driver.findElement(By.xpath("//div[text()='" + month + "']/following-sibling::div[text()='" + year
						+ "']/ancestor::div[@class='picker__box']/descendant::div[text()='" + date + "']")).click();
				break;

			} catch (Exception e) {
				driver.findElement(By.xpath("//div[@title='Next month']")).click();
				i++;
			}

		}

		// Fri Feb 11 16:48:24 IST 2022
		Thread.sleep(5000);
		driver.quit();
	}

	/**
	 * returs the current date
	 * 
	 * @return format dd MMMM YYYY
	 */
	public String getDate() {
		SimpleDateFormat format = new SimpleDateFormat("dd MMMM yyyy");
		String date = format.format(new Date());
		return date;
	}
}
