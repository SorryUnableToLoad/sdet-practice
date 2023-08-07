package sdet.externalfilereading.excelfile.zerocell;

import com.creditdatamw.zerocell.annotation.Column;
import com.creditdatamw.zerocell.converter.BooleanConverter;
import io.github.sskorol.data.Sheet;

@Sheet(name = "Sheet1")
public class ZeroCellTestData {
    @Column(name = "fName", index = 0)
    private String fName;

    @Column(name = "lName", index = 1)
    private String lName;

    @Column(name = "mobileNo", index = 2)
    private long mobileNo;

    @Column(name = "isBoolean", index = 3, converterClass = BooleanConverter.class)
    private boolean isBoolean;

    @Override
    public String toString() {
        return "ZeroCellTestData{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", mobileNo=" + mobileNo +
                ", isBoolean=" + isBoolean +
                '}';
    }

    public String getFName() {
        return fName;
    }

    public String getLName() {
        return lName;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public Boolean getIsBoolean() {
        return isBoolean;
    }
}
