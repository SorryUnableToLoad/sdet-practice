package bp.prac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTab {
	@Test
	public void tab() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String url = "https://www.flipkart.com/";
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.open('https://www.facebook.com','_blank');");
		
		driver.quit();
		

	}

}
