package Devdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class Excelreadwrite {

	public static void main(String[] args) throws IOException {
		
		
	

		File file = new File("src\\test\\resources\\Final read.xls");
		FileInputStream inputstream = new FileInputStream(file);
		HSSFWorkbook wb = new HSSFWorkbook(inputstream);
		HSSFSheet sheet = wb.getSheetAt(0);
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		System.out.println("==================================================");
		// to print cell value particularly
		System.out.println(cell.getStringCellValue());
		int rowcount = sheet.getLastRowNum();
		for (int i = 1; i <= rowcount; i++) {
			int cellcount = sheet.getRow(i).getLastCellNum();
			for (int j = 0; j < cellcount; j++) {
				System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() + " ");
				sheet.getRow(i).createCell(2).setCellValue(true);
			}
			// Below line used to print specific column from all rows
			System.out.print(sheet.getRow(i).getCell(1).getStringCellValue() + "");
			System.out.println();
		}
		FileOutputStream outputstream = new FileOutputStream(file);
		wb.write(outputstream);
		wb.close();
	}
}
