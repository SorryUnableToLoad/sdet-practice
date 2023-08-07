package sdet.externalfilereading.excelfile.zerocell;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class ZeroCellTestDataTest {


    @Test(dataProvider = "getData")
    public void zeroCell(ZeroCellTestData data) {
        System.out.println(data.getFName());
        System.out.println(data.getIsBoolean());
        System.out.println(data.getLName());
        System.out.println(data.getMobileNo());
    }

    @DataProvider
    public Object[] getData() {
        List<ZeroCellTestData> data = ZeroCellReader.getTestData();
        return data.toArray();
    }
}
