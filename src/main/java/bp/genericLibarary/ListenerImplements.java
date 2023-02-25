package bp.genericLibarary;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.io.File;
import java.io.IOException;

public class ListenerImplements implements ITestListener {
	@Override
	public void onTestFailure(ITestResult result) {
		String testName=result.getMethod().getMethodName();
		Reporter.log(testName,true);
		EventFiringWebDriver eDriver=new EventFiringWebDriver(BaseClass.driver);
		File srcFile=eDriver.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./screenshot/"+testName+".png");
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
