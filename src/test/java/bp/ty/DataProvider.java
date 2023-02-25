package bp.ty;

import org.testng.annotations.Test;

public class DataProvider {

	@Test(dataProvider = "dataProvider_NameOfOrgWithIndType")
	public void createOrgWithDataProvider(String nameOfOrg, String indType) {
		System.out.println("created org " + nameOfOrg + "ind type" + indType);
	}

	@org.testng.annotations.DataProvider
	public Object[][] dataProvider_NameOfOrgWithIndType() {
		Object[][] objarr = new Object[4][2];

		objarr[0][0] = "HDFC";
		objarr[0][1] = "Banking";

		objarr[1][0] = "apollo";
		objarr[1][1] = "pharm";

		objarr[2][0] = "TATA";
		objarr[2][1] = "Manufacturing";

		objarr[3][0] = "Reliance";
		objarr[3][1] = "refinery";

		return objarr;

	}
}
