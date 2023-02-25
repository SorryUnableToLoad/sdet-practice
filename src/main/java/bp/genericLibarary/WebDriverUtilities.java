package bp.genericLibarary;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * This class contains generic methods for all WebDriver actions
 * 
 * @author Suraj
 *
 */
public class WebDriverUtilities {
	/**
	 * This method will maximize the window
	 * 
	 * @param driver
	 */
	public void maximiseWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}

	/**
	 * This method will wait for page to load
	 * 
	 * @param driver
	 */
	
	/**
	 * This method will wait for page to load
	 * @param driver
	 */
	public void waitForPageLoad(WebDriver driver) {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	/**
	 * This method will wait until the element becomes clickAble
	 * @param driver
	 */
	public void waitForElementToBeClickable(WebDriver driver, WebElement element) {
		
		WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void implicitwait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void explicitWait(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * this method will wait for element and then perform the action
	 * 
	 * @param element
	 * @throws InterruptedException
	 */
	public void customWait(WebElement element) {
		int i = 0;
		while (i < 1000) {
			try {
				element.isDisplayed();
				break;

			} catch (Exception e) {
				i++;
			}
		}
	}

	/**
	 * select DropDown by index
	 * 
	 * @param element
	 * @param index
	 */
	public void select(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	/**
	 * select DropDown by value
	 * 
	 * @param element
	 * @param value
	 */
	public void select(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	/**
	 * select DropDown by value
	 * 
	 * @param element
	 * @param value
	 */
	public void select(String text, WebElement element) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	/**
	 * this method will perform double click action
	 * 
	 * @param driver
	 */
	public void doubleClick(WebDriver driver) {
		Actions a = new Actions(driver);
		a.doubleClick().perform();
	}

	/**
	 * this method will Mouse hovering action on an element
	 * 
	 * @param driver
	 * @param element
	 */
	public void mouseHover(WebDriver driver, WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	/**
	 * Right click action
	 * 
	 * @param driver
	 */
	public void rightClick(WebDriver driver, WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).perform();
	}

	/**
	 * Drag and Drop action
	 * 
	 * @param driver
	 * @param src
	 * @param dst
	 */
	public void dragAndDrop(WebDriver driver, WebElement src, WebElement dst) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, dst);
	}

	/**
	 * this method will accept alert pop up
	 * 
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	/**
	 * This method will cancel alert pop up
	 * 
	 * @param driver
	 */
	public void dismissAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	/**
	 * this method will Take screen shot and save it in the destination
	 * 
	 * @param driver
	 * @param screenshotname
	 * @throws Throwable
	 */
	public void getScreenshot(WebDriver driver, String screenshotname) throws Throwable {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("./screenshot/" + screenshotname + ".png");
		Files.copy(src, dst);
	}

	/**
	 * To switch to the window depending on partial title
	 * 
	 * @param driver
	 */
	public void swtichToWindow(WebDriver driver, String partialWindowTittle) {
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String winID = it.next();
			driver.switchTo().window(winID);
			String currentWinTitle = driver.getTitle();
			if (currentWinTitle.contains(partialWindowTittle)) {
				break;
			}
		}
	}

	/**
	 * To Swtich between frames
	 * 
	 * @param driver
	 * @param index
	 */
	public void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	/**
	 * To switch frame with element
	 * 
	 * @param driver
	 * @param element
	 */
	public void switchToFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}

	/**
	 * To swtich frame with name
	 * 
	 * @param driver
	 * @param name
	 */
	public void swtichToFrame(WebDriver driver, String name) {
		driver.switchTo().frame(name);
	}

	/**
	 * This method is used to switch to default frame
	 * 
	 * @param driver
	 */
	public void switchToDefaultFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	/**
	 * This method is used to Switch to parent frame
	 * 
	 * @param driver
	 */
	public void switchToFrame(WebDriver driver) {
		driver.switchTo().parentFrame();
	}

	/**
	 * this method is used to scroll at bottom of page
	 * 
	 * @param driver
	 */
	public void scrollToElement(WebDriver driver) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500");

	}

	/**
	 * This is used to scroll into view of the element
	 * 
	 * @param driver
	 * @param element
	 */
	public void scrollToElement(WebDriver driver, WebElement element) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("argument[0].scrollIntoView()");
	}

	/**
	 * This is used to press enter key from keyboard
	 * 
	 * @throws Throwable
	 */
	public void keyPress() throws Throwable {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
