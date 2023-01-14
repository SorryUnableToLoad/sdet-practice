package ty;

import genericLibarary.ExcelUtilities;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class DataProviderExcel {
	@Test(dataProvider = "dataProvider_CreatOrg")
	public void createOrgWithDataProviderExcel(String nameOfOrg, String indType) {
		System.out.println(nameOfOrg+"	\t==>		"+indType);
	}

	@DataProvider
	public Object[][] dataProvider_CreatOrg() throws EncryptedDocumentException, IOException {
		ExcelUtilities eLib = new ExcelUtilities();
		int rowcount = eLib.getRowCount("creatorg", 0);
		System.out.println("***************************************************");
		System.out.println(rowcount);
		int cellcount = eLib.getCellCount("creatorg", rowcount);
		System.out.println(cellcount);

		String[][] objarr = new String[rowcount][cellcount];

		for (int i = 1; i <= rowcount; i++) {
			for (int j = 0; j < cellcount; j++) {
				objarr[i - 1][j] = eLib.getDatafromExcel("creatorg", i, j);
			}
		}
		return objarr;
	}
	
	//dataProvider in another class
	@Test(dataProvider = "dataProvider_NameOfOrgWithIndType",dataProviderClass = DataProviderInAnotherClass.class)
	public void createOrgWithDataProvider(String nameOfOrg, String indType) {
		System.out.println(nameOfOrg+"	\t==>		"+indType);
	}
}
