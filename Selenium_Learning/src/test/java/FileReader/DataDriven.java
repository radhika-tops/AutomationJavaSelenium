package FileReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class DataDriven {
	//Identify Testcases coloum by scanning the	entire 1st row
	//once coloumn is identified then scan entire testcase coloum to identify purcjhase testcase row
	//after you grab purchase testcase row = pull all the data of that row and	feed into test


	public static void getData() throws IOException {
		//fileInputStream argument
		ArrayList<String> a = new ArrayList<String>();
		FileInputStream fis = new FileInputStream("C:\\Users\\baps\\Desktop\\practice- Copy.xlsx");
		System.out.println(fis);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		System.out.println(workbook);
		int sheets = workbook.getNumberOfSheets();
		System.out.println("no of sheets : "+sheets);
		
		
		
		for(int i = 0; i<sheets;i++) {
			if(workbook.getSheetName(i).equalsIgnoreCase("home")) {
				//to read single sheet
				//XSSFSheet sheet = workbook.getSheetAt(i);
				
				
				System.out.println("get home sheet");
				//to read single sheet
				XSSFSheet sheet = workbook.getSheetAt(i);
				System.out.println("sheet -> "+sheet.getWorkbook());
				//Identify Testcases coloum by scanning the entire 1st row
				Iterator<Row> rows = sheet.iterator();// sheet is collection of rows
				System.out.println("Rows : ->"+rows);
				Row firstrow = rows.next();
				System.out.println("first row -> "+firstrow);
				Iterator<Cell> ce = firstrow.cellIterator();// row is collection of cells
				System.out.println("cell -> "+ce.toString());
				int k = 0;
				int coloumn = 0;
				while (ce.hasNext()) {
					Cell value = ce.next();
					System.out.println("cell value : "+value);
					if (value.getStringCellValue().equalsIgnoreCase("TestCases")) {
						coloumn = k;
					}
					k++;
				}
				System.out.println(coloumn);
				/*
////once coloumn is identified then scan entire testcase coloum to identify purchase testcase row
				while (rows.hasNext()) {
					Row r = rows.next();
					if (r.getCell(coloumn).getStringCellValue().equalsIgnoreCase("")) {
////after you grab purchase testcase row = pull all the data of that row and feed into test
						Iterator<Cell> cv = r.cellIterator();
						while (cv.hasNext()) {
							Cell c = cv.next();
							if (c.getCellType() == CellType.STRING) {
								a.add(c.getStringCellValue());
							} else {
								a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
							}
						}
					}
				}*/
			}
		}
		//return a;
	}

	public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub
		
		getData();
	}
				//identify testcases coloumn by scanning the entire 1st row
				
			}
		
	
		
