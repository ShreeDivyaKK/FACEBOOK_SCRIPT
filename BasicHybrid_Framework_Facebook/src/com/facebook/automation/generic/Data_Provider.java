package com.facebook.automation.generic;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;

public class Data_Provider extends FetchingDataFrom_Excel
{
@DataProvider(name="TestData")
public Object[][] getDataFromExcel() throws EncryptedDocumentException, IOException
{
	Object[][] arr = FetchingDataFrom_Excel.getData("Sheet1");
	return arr;
}
}
