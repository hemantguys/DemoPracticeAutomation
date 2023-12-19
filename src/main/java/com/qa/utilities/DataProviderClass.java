package com.qa.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.qa.testBase.TestBase;

public class DataProviderClass extends TestBase
{
	String path="C:\\Users\\HP\\eclipse-workspaceSept7Javasele\\October22DemoRecordFramework1\\archetype-fitgoodies-quickstart\\UPass.xlsx";
	File file;
	FileInputStream fis;
	public String readData(int sheet,int row, int col) throws EncryptedDocumentException, IOException
	{
		file=new File(path);
		fis=new FileInputStream(file);
		String data= WorkbookFactory.create(fis).getSheetAt(sheet).getRow(row).getCell(col).getStringCellValue();
		return data;
	}
	
	public int rowCount(int sheet) throws EncryptedDocumentException, IOException
	{
		file=new File(path);
		fis=new FileInputStream(file);
		int row= WorkbookFactory.create(fis).getSheetAt(sheet).getLastRowNum();
		return row;
	}
	
	public int colCount(int sheet, int row) throws EncryptedDocumentException, IOException
	{
		file=new File(path);
		fis=new FileInputStream(file);
		int col= WorkbookFactory.create(fis).getSheetAt(sheet).getRow(row).getLastCellNum();
	   return col;	
	}

}
