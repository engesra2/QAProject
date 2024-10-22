package com.learnautomation.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Reporter;

public class ExcelReader {

	public static Object[][] getDataFromExcel(String sheetName) {
		XSSFWorkbook wbworkbook = null;

		try {
			wbworkbook = new XSSFWorkbook(new FileInputStream(new File("./TestData/ExcelData.xlsx")));
		} catch (FileNotFoundException e) {
			Reporter.log("LOG:FAIL-File not found" + e.getMessage(), true);

		} catch (IOException e) {

			Reporter.log("LOG:FAIL - Could not load the file" + e.getMessage(), true);

		}

		int rowcount = wbworkbook.getSheet(sheetName).getPhysicalNumberOfRows();

		int cellcount = wbworkbook.getSheet(sheetName).getRow(0).getPhysicalNumberOfCells();

		Object[][] arr = new Object[rowcount - 1][cellcount];

		for (int i = 1; i < rowcount; i++) {
			for (int j = 0; j < cellcount; j++) {
				String valueString = "";

				CellType type = wbworkbook.getSheet(sheetName).getRow(i).getCell(j).getCellType();

				if (type == CellType.STRING) {
					valueString = wbworkbook.getSheet(sheetName).getRow(i).getCell(j).getStringCellValue();
				}

				else if (type == CellType.NUMERIC) {
					double doubleValue = wbworkbook.getSheet(sheetName).getRow(i).getCell(j).getNumericCellValue();

					valueString = String.valueOf(doubleValue);
				}

				else if (type == CellType.BOOLEAN) {
					boolean booleanvalue = wbworkbook.getSheet(sheetName).getRow(i).getCell(j).getBooleanCellValue();

					valueString = String.valueOf(booleanvalue);
				}

				else if (type == CellType.BLANK) {
					valueString = "";
				}

				arr[i - 1][j] = valueString;

			}

		}
		return arr;

	}

}
