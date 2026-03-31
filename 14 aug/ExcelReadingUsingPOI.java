import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadingUsingPOI {

	public static void main(String[] args) throws IOException {
		FileInputStream ip = new FileInputStream("D:\\Demo.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(ip);
		XSSFSheet sh =wb.getSheet("TestData");
		//all set to read the excel data
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sh.getRow(0).getCell(2).getStringCellValue());
		System.out.println(sh.getRow(2).getCell(1).getStringCellValue());
		System.out.println(sh.getRow(5).getCell(2).getStringCellValue());
		
		//to fetch the numbers
		System.out.println(sh.getRow(5).getCell(2).getNumericCellValue());

		
		//find out total no of rows
		int totalRows=sh.getPhysicalNumberOfRows();
		
		//find out total no of columns
		int totalCoumns=sh.getRow(0).getPhysicalNumberOfCells();
		
		//print the entire data from sheet
		for(int i=0;i<totalRows;i++)//rows
		{
			for(int j=0;j<totalCoumns;j++)//columns
			{
				System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
			}
		}
		
		
	}

}

