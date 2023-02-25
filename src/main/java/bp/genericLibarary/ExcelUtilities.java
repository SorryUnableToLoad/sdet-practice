package bp.genericLibarary;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * This class will read and write data onto excel sheet
 * 
 * @author Suraj
 *
 */
public class ExcelUtilities {
	/**
	 * This method will read data from excel sheet and return the cell value
	 * 
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return
	 * @throws Throwable
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getDatafromExcel(String sheetname, int row, int cell) throws EncryptedDocumentException, IOException {
		File f = new File(IPathcontants.ExcelPath);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}

	/**
	 * This method will return the row count in excel count
	 * 
	 * @param sheet
	 * @return
	 * @throws Throwable
	 */
	public int getRowCount(String sheet, int row) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(IPathcontants.ExcelPath );
		Workbook wb = WorkbookFactory.create(fis);
		int rowcount = wb.getSheet(sheet).getLastRowNum();
		return rowcount;
	}
	
	/**
	 * This method will return the cell count in excel count
	 * 
	 * @param sheet
	 * @return
	 * @throws Throwable
	 */
	public int getCellCount(String sheet, int row) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(IPathcontants.ExcelPath );
		Workbook wb = WorkbookFactory.create(fis);
		int cellcount = wb.getSheet(sheet).getRow(0).getLastCellNum();
		return cellcount;
	}
	/**
	 * This method will write the data onto the excel sheet
	 * 
	 * @param sheet
	 * @param rowNo
	 * @param cellNo
	 * @param data
	 * @throws Throwable
	 */
	public void writeDataToExcel(String sheetName, int row, int cell, String data)
			throws EncryptedDocumentException, IOException {
		File f = new File(IPathcontants.ExcelPath);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(data);

		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();
	}
}
