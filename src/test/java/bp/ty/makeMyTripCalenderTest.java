package bp.ty;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.concurrent.TimeUnit;

public class makeMyTripCalenderTest {
	@Test
	public void claender() {
		LocalDate systemdate = LocalDate.now();
		int date = systemdate.getDayOfMonth();
		int year = systemdate.getYear();
		Month monthAndYear = systemdate.getMonth();
		System.out.println(monthAndYear);
//		String month = systemdate.getMonth().toString();
//		String actualmonth = month.substring(0, 1) + month.substring(1).toLowerCase();
//		System.out.println(actualmonth);
//		String monthAndYear = actualmonth + " " + year;

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		WebElement depart = driver.findElement(By.id("departure"));
		act.click(depart).perform();
		act.click(depart).perform();

		String datepath = "//div[contains(text(),'" + year
				+ "')]/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='" + date + "']";
		String next = "//span[@class='DayPicker-NavButton DayPicker-NavButton--next']";

		for (;;) {
			try {
				driver.findElement(By.xpath(datepath)).click();
				break;
			} catch (Exception e) {
				driver.findElement(By.xpath(next)).click();
			}
		}

	}
}
