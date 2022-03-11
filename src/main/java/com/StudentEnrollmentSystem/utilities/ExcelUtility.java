package com.StudentEnrollmentSystem.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	private static      XSSFWorkbook excelWBook; //Excel WorkBook
    private static      XSSFSheet    excelWSheet; //Excel Sheet
   
    // This method has two parameters: "Test data excel file name" and "Excel sheet name"
    // It creates FileInputStream and set excel file and excel sheet to excelWBook and excelWSheet variables.

    public static String getCellData(int RowNum, int ColNum) throws IOException {
      
        // Open the Excel file
    	
    	FileInputStream ExcelFile = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources"
                + "/LoginTestData.xlsx");
     	
    	 //FileInputStream ExcelFile = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources"
         //      + "/StudentRegistrationTestData.xlsx");
    	
    	excelWBook = new XSSFWorkbook(ExcelFile);
        excelWSheet = excelWBook.getSheetAt(0);
        XSSFCell cell=excelWSheet.getRow(RowNum).getCell(ColNum);
        
        //return cell.getStringCellValue();
        
        DataFormatter formatter = new DataFormatter();
        String val = formatter.formatCellValue(excelWSheet.getRow(RowNum).getCell(ColNum));
        return(val);
    }
}