import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WrittingIntoExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream ip = new FileInputStream("D:\\Demo.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(ip);
		XSSFSheet sh =wb.getSheet("TestData");
		
		//how to write into an excel
		sh.getRow(1).createCell(3).setCellValue("pass");
		sh.createRow(6).createCell(0).setCellValue("fail");
		
		FileOutputStream fout = new FileOutputStream("D:\\Demo.xlsx");
		wb.write(fout);
		wb.close();
		
	}

}
