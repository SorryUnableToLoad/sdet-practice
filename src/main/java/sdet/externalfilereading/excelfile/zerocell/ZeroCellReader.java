package sdet.externalfilereading.excelfile.zerocell;

import com.creditdatamw.zerocell.Reader;

import java.io.File;
import java.util.List;

public final class ZeroCellReader {
    private static List<ZeroCellTestData> testData = null;

    static {
        testData = Reader.of(ZeroCellTestData.class)
                .from(new File("./src/test/resources/externalfile/testdata.xlsx"))
                .sheet("sheet1")
                .skipHeaderRow(true).list();
    }

    private ZeroCellReader() {
    }

    public static List<ZeroCellTestData> getTestData() {
        return testData;
    }
}
