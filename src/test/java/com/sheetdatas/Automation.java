 package com.sheetdatas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Automation {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\DELL\\eclipse-workspace\\FrameWork1\\Excel Sheets\\automation sheet.xlsx");

		FileInputStream stream = new FileInputStream(file);

		Workbook workbook = new XSSFWorkbook(stream);

		Sheet sheet = workbook.getSheet("Datas");
		
		
		for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);

			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				
				Cell cell = row.getCell(j);
				
				CellType cellType = cell.getCellType();
				if (j<=0) {
					
				
					int physicalNumberOfRows = sheet.getPhysicalNumberOfRows()*row.getPhysicalNumberOfCells();
			System.out.println(physicalNumberOfRows);}
				
				

				switch (cellType) {
				case STRING:
					String text = cell.getStringCellValue();
					System.out.println(text);
					break;

				case NUMERIC:
					if (DateUtil.isCellDateFormatted(cell)) {

						Date date = cell.getDateCellValue();

						SimpleDateFormat datef = new SimpleDateFormat("dd-MMM-yyyy");
						String format = datef.format(date);
						System.out.println(format);
					}

					else {
						double d = cell.getNumericCellValue();
						BigDecimal v = BigDecimal.valueOf(d);

						String string = v.toString();
						System.out.println(string);
					}
				}

			}

			System.out.println("=====================");
		}
		
				

}}
