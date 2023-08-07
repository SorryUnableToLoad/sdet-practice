package sdet.externalfilereading.excelfile.zerocell;

import com.creditdatamw.zerocell.Reader;

import java.io.File;
import java.util.List;

public class ZeroCellRunner {
    public static void main(String[] args) {
        List<ZeroCellTestData> testData = Reader.of(ZeroCellTestData.class)
                .from(new File("./src/test/resources/externalfile/testdata.xlsx"))
                .sheet("sheet1")
                .skipHeaderRow(true).list();

        testData.forEach(System.out::println);
    }
}
