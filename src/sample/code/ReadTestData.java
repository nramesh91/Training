package sample.code;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadTestData {
	public static void main(String args[]) throws IOException{
		String s = System.getProperty("user.dir");
		s = s.concat("\\TestData.xlsx");
		System.out.println(s);
		File f = new File(s);
		if (f.exists()){
			FileInputStream fis = new FileInputStream(f);
			XSSFWorkbook w = new XSSFWorkbook(fis);
			XSSFSheet sh = w.getSheet("Sheet1");
			System.out.println(sh.getLastRowNum());
			for (int i = 0; i <= sh.getLastRowNum(); i++){
				XSSFRow row = sh.getRow(i);
				for (int j = 0; j < row.getLastCellNum(); j++){
					XSSFCell cell = row.getCell(j);
					System.out.print(cell + "\t \t");
				}
				System.out.println();
				
			}
			
		}
		
	}

}
