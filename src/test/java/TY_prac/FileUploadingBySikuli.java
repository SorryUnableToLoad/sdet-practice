package TY_prac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FileUploadingBySikuli {
	@Test
	public void uploadFileTest() throws FindFailed {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("G:\\work-space\\AutoPractice\\src\\test\\resources\\SampleFile.html");
		
		Screen screen=new Screen();
		Pattern chooseFileEle=new Pattern("G:\\work-space\\AutoPractice\\sikuliimgFolder\\ChooseFile.png");
		Pattern enterFileName=new Pattern("G:\\work-space\\AutoPractice\\sikuliimgFolder\\FileName.png");
		Pattern openBtn=new Pattern("G:\\work-space\\AutoPractice\\sikuliimgFolder\\openButton.png");
	
		screen.click(chooseFileEle);
		screen.type(enterFileName,"/AutoPractice/sikuliimgFolder/IMG_20220203_215005_HDR.jpg");
		screen.click(openBtn);
	
	}

}
