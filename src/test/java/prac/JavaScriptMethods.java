package prac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class JavaScriptMethods {
	WebDriver driver = null;

	@Test
	public void launchBrowser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		/*
		 * driver.findElement(By.name("q")).sendKeys("Suraj"); Thread.sleep(3000);
		 * driver.findElement(By.name("q")).clear();
		 */

		/*
		 * Thread.sleep(3000); String message = "alert generated";
		 * generateAlertJse(driver, message); Thread.sleep(3000);
		 * driver.switchTo().alert().accept(); Thread.sleep(3000);
		 * 
		 * refreshfBrowserByJse(driver); Thread.sleep(3000);
		 * 
		 * getTitleByJse(driver); Thread.sleep(3000);
		 * 
		 * getPageInnerText(driver); Thread.sleep(3000);
		 * 
		 * WebElement element = driver.findElement(By.name("q")); drawBorder(driver,
		 * element); Thread.sleep(3000);
		 */

		WebElement eleme = driver.findElement(By.xpath("//a[text()='Sign in']"));
		String cc = eleme.getCssValue("background");
		System.out.println(cc);
		flash(driver, eleme);
		Thread.sleep(3000);

		driver.quit();
	}

	public void sendTextByJse(WebDriver driver, WebElement element) throws InterruptedException {
		WebElement serchbox = driver.findElement(By.name("q"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		/*
		 * jse.executeScript("document.getElementsByName('q').values='java'");
		 * Reporter.log("Text Enterd", true); Thread.sleep(3000);
		 * jse.executeScript("document.getElementsByName('q').values=''");
		 * Reporter.log("Text cleared", true); Thread.sleep(3000);
		 */

		jse.executeScript("arguments[0].value='selenium'", serchbox);
		Reporter.log("Text Enterd", true);
		Thread.sleep(3000);
		jse.executeScript("arguments[0].value=''", serchbox);
		Reporter.log("Text cleared", true);
		Thread.sleep(3000);
	}

	public void clickByJse(WebDriver driver, WebElement element) {
		// ((JavascriptExecutor) driver).executeScript("arguments[0].click();,element);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("argument[0].click;", element);
	}

	public void generateAlertJse(WebDriver driver, String message) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("alert( '" + message + "')");
	}

	public void refreshfBrowserByJse(WebDriver driver) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("history.go(0)");
	}

	public String getTitleByJse(WebDriver driver) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		String title = jse.executeScript("return document.title;").toString();
		System.out.println(title);
		return title;
	}

	public String getPageInnerText(WebDriver driver) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		String title = jse.executeScript("return document.documentElement.innerText;").toString();
		System.out.println(title);
		return title;
	}

	public void drawBorder(WebDriver driver, WebElement element) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].style.border='3px solid red'", element);

	}

	public void flash(WebDriver driver, WebElement element) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		String bgcolor = element.getCssValue("background");
		for (int i = 0; i < 20; i++) {
			changeColor("rgb(0,200,0)", element, driver);
			changeColor(bgcolor, element, driver);
		}
	}

	public void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].style.backgroundColour='" + color + "'", element);
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {

		}
	}

}
