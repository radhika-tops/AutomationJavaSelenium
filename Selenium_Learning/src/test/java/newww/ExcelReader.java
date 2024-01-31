package newww;

import java.io.IOException;



import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public ExcelReader(String filePath, String sheetName) {
		super();
		this.filepath = filePath;
		this.sheetName = sheetName;
	}
	
	String filepath;
	String sheetName;
	
	//for no of rows
	public int rowcount() {
		int i=0;
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(filepath);
			XSSFSheet worksheet = workbook.getSheet(sheetName);
			i = worksheet.getPhysicalNumberOfRows();
		}catch (IOException e) {
			e.printStackTrace();
		}
		return i;
	}
	//for no of columns
	public int colcount() {
		int i=0;
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(filepath);
			XSSFSheet worksheet = workbook.getSheet(sheetName);
			i = worksheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println(i);
		}catch (IOException e) {
			e.printStackTrace();
		}
		return i;
	}
	//for particular data in cell
	public String getData(int row, int col) {
		String data = null;
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(filepath);
			XSSFSheet worksheet = workbook.getSheet(sheetName);
			data = worksheet.getRow(row).getCell(col).getStringCellValue();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return data;
	}
}
