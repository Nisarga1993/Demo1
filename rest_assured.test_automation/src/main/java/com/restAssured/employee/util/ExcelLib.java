package com.restAssured.employee.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.restAssured.employee.base.IConstants;

/**
 * 
 * @author NISARGA
 * 
 *
 */
public class ExcelLib implements IConstants
{
	public static LinkedHashMap getRequestParameters(String testCaseName,String excelPath,String sheetName) throws EncryptedDocumentException, IOException
	{
		LinkedHashMap apiReqData = new LinkedHashMap();
		try 
		{
			FileInputStream fis = new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
		    Sheet sh=wb.getSheet(sheetName);
		    int rows=sh.getPhysicalNumberOfRows();
			for(int i=0;i<rows;i++)
			{
				if(sh.getRow(i).getCell(1).getStringCellValue().equalsIgnoreCase(testCaseName))
				{
					for(int j=2;j<sh.getRow(i).getPhysicalNumberOfCells();j++)
					{
						apiReqData.put(sh.getRow(1).getCell(j).getStringCellValue(),
						sh.getRow(i).getCell(j).getStringCellValue());
					}
				break;
			}
		} 
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
    }
	return apiReqData;
}
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	LinkedHashMap lst = getRequestParameters("getOneEmployee", "./src/test/resources/data/practice.xlsx", "Sheet1");
	System.out.println(lst);
	}
}
