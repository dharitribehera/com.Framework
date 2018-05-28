package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDriven implements Constant

{
	
	
	public String abc(String Sheet, int r, int c)
	{
	String s="";
	try
	{
	FileInputStream f=new FileInputStream(PATH);
		Workbook w = WorkbookFactory.create(f);
		s=w.getSheet(Sheet).getRow(r).getCell(c).getStringCellValue();
	}
	catch(Exception e)
	{
		
	}
				
	return s;			
	}		

}
