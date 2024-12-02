package testNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Attribts {

	@Test
	public void demo1() {
		System.out.println("This is Smoke");
	}
	
	@Test(invocationCount = 2)
	public void demo2() {
		System.out.println("This is Regression");
	}
	
	@Test
	public void demo3() {
		System.out.println("This is Smoke");
	}
	
	@Test(invocationCount = 2)
	public void demo4() {
		System.out.println("This is Regression");
	}
	
	
	@DataProvider
	public Object[][] dataProvider(){
		
		Object[][] data = new Object[3][2] ;
		data[0][0] = "Riza";
		data[0][1] = "WAshiq" ;
		data[1][0] = "Christiano";
		data[1][1] = "Ronaldo" ;
		data[2][0] = "Virat";
		data[2][1] = "Kohli" ;
		
		return data;
	}
	
	@Test(dataProvider = "dataProviderExcel")
	public void dataProv(String fn , String ln) {
		System.out.print(fn + "    ");
		System.out.println(ln);
		
	}
	
	@DataProvider
	public Object[][] dataProviderExcel() throws EncryptedDocumentException, IOException
	{
		FileInputStream f = new FileInputStream("C:\\Users\\User\\Desktop\\Selenium\\Selenium_Full_Cntent\\src\\test\\java\\DDT\\data.xlsx");
		Workbook w = WorkbookFactory.create(f);
		Object[][] data = new Object[3][2] ;
		for(int i=0 ; i<3 ; i++)
		{
			for(int j=0 ; j<2 ;j++)
			{
				data[i][j] = w.getSheet("abc").getRow(i+1).getCell(j+1).getStringCellValue();
			}
		}
		
		return data;
	}
	
}
