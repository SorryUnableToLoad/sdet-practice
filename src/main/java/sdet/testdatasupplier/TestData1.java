package sdet.testdatasupplier;

import com.creditdatamw.zerocell.annotation.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestData1 {
    @Column(name = "fname", index = 0)
    private String fname;
    @Column(name = "lname", index = 1)
    private String lname;
    @Column(name = "mobileno", index = 2)
    private String mobileno;
    @Column(name = "isboolean", index = 3)
    private String isboolean;
}
