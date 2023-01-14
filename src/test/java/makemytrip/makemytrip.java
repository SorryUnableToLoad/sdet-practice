package makemytrip;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class makemytrip {
	WebDriver driver;

	@Test(dataProvider = "dataProvidFromExcel")
	public void run(String srcc, String destt) throws EncryptedDocumentException, IOException, InterruptedException {

		System.out.println(srcc + "\t" + destt);

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");

		Actions a = new Actions(driver);
		WebElement from = driver.findElement(By.xpath("//span[text()='From']"));
		a.moveToElement(from).doubleClick(from).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='From']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(srcc);
		Thread.sleep(1000);
		WebElement fromm = driver.findElement(By.xpath(
				"//p[text()='SUGGESTIONS ']/ancestor::div[@id='react-autowhatever-1']/descendant::div[@class='makeFlex hrtlCenter']"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", fromm);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='To']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(destt);
		Thread.sleep(1000);
		WebElement dest = driver.findElement(By.xpath(
				"//p[text()='SUGGESTIONS ']/ancestor::div[@id='react-autowhatever-1']/descendant::div[@class='makeFlex hrtlCenter']"));
		jse.executeScript("arguments[0].click();", dest);
		Thread.sleep(1000);
		WebElement serchbtn = driver.findElement(By.xpath("//a[text()='Search']"));
		a.moveToElement(serchbtn).doubleClick(serchbtn).perform();
		Thread.sleep(5000); //
		// driver.findElement(By.xpath("//span[@class='bgProperties
		// icon20overlayCrossIcon']")).click();
		Thread.sleep(2000);
		List<WebElement> flights = driver.findElements(By.xpath("//div[@class='fli-list  simpleow ']"));
		Thread.sleep(5000);
		int count = flights.size();
		System.out.println(count);

		FileInputStream fis = new FileInputStream("./src/test/resources/Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		int row = sheet.getLastRowNum();
		short cell = sheet.getRow(0).getLastCellNum();
		for (int i = 0; i <row; i++) {
			sheet.getRow(i).getCell(2).setCellValue(count);
		}
		FileOutputStream fos=new FileOutputStream("./src/test/resources/Book1.xlsx");
		wb.write(fos);
		wb.close();
		Thread.sleep(5000);
		driver.quit();
		
	}

	@DataProvider
	public Object[][] dataProvidFromExcel() throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./src/test/resources/Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		int row = sheet.getLastRowNum();
		short cell = sheet.getRow(0).getLastCellNum();
		System.out.println(row);
		System.out.println(cell);
		Object[][] arryobj = new Object[row][cell-1];
		for (int i = 0; i < row; i++) {
			arryobj[i][0] = sheet.getRow(i).getCell(0).getStringCellValue();
			arryobj[i][1] = sheet.getRow(i).getCell(1).getStringCellValue();

		}
		return arryobj;

	}
//		Object[][] arryobj = new Object[10][2];
//		arryobj[0][0] = sheet.getRow(1).getCell(0).getStringCellValue();// "bangalore";
//		arryobj[0][1] = sheet.getRow(1).getCell(1).getStringCellValue();// "mumbai";
//
//		arryobj[1][0] = sheet.getRow(2).getCell(0).getStringCellValue();// "bangalore";
//		arryobj[1][1] = sheet.getRow(1).getCell(0).getStringCellValue();// "kolkata";
//
//		arryobj[2][0] = sheet.getRow(1).getCell(0).getStringCellValue();// "bangalore";
//		arryobj[2][1] = sheet.getRow(1).getCell(0).getStringCellValue();// "hyderbad";
//
//		arryobj[3][0] = sheet.getRow(1).getCell(0).getStringCellValue();// "bangalore";
//		arryobj[3][1] = sheet.getRow(1).getCell(0).getStringCellValue();// "delhi";
//
//		arryobj[4][0] = sheet.getRow(1).getCell(0).getStringCellValue();// "bangalore";
//		arryobj[4][1] = sheet.getRow(1).getCell(0).getStringCellValue();// "dubai";
//
//		arryobj[5][0] = sheet.getRow(1).getCell(0).getStringCellValue();// "bangalore";
//		arryobj[5][1] = sheet.getRow(1).getCell(0).getStringCellValue();// "pune";
//
//		arryobj[6][0] = sheet.getRow(1).getCell(0).getStringCellValue();// "bangalore";
//		arryobj[6][1] = sheet.getRow(1).getCell(0).getStringCellValue();// "pune";
//		
//		arryobj[7][0] = sheet.getRow(1).getCell(0).getStringCellValue();// "bangalore";
//		arryobj[7][1] = sheet.getRow(1).getCell(0).getStringCellValue();// "pune";
//		
//		arryobj[8][0] = sheet.getRow(1).getCell(0).getStringCellValue();// "bangalore";
//		arryobj[8][1] = sheet.getRow(1).getCell(0).getStringCellValue();// "pune";
//		
//		arryobj[9][0] =sheet.getRow(1).getCell(0).getStringCellValue();// "bangalore";
//		arryobj[9][1] = sheet.getRow(1).getCell(0).getStringCellValue();// "pune";
//		return arryobj
}
