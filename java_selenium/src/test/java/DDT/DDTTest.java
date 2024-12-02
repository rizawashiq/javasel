package DDT;

//import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class DDTTest {
	
	public static void main(String[] args) throws IOException, ParseException, SQLException {
		
		// data from property file
		FileInputStream f = new FileInputStream("C:\\Users\\User\\Desktop\\Selenium\\java_selenium\\src\\test\\java\\DDT\\data.properties");
		Properties p = new Properties();
		p.load(f);
		System.out.println(p.getProperty("un"));
		
		// data from excel file
		f = new FileInputStream("C:\\Users\\User\\Desktop\\Selenium\\java_selenium\\src\\test\\java\\DDT\\data.xlsx");
		Workbook w = WorkbookFactory.create(f);
		System.out.println(w.getSheet("abc").getRow(1).getCell(0).getNumericCellValue());
		
		int numofrows =  w.getSheet("abc").getPhysicalNumberOfRows();
		System.out.println(numofrows);
		
		for(int i = 1 ; i<numofrows ; i++)
		{
			System.out.println(w.getSheet("abc").getRow(i).getCell(1).getStringCellValue());
		}
		
		
		for(int i = 1 ; i<numofrows ; i++)
		{
			int x = new Random().nextInt(30);
			w.getSheet("abc").getRow(i).createCell(4).setCellValue("RCB"+x);
		}
		FileOutputStream fo = new FileOutputStream("C:\\Users\\User\\Desktop\\Selenium\\java_selenium\\src\\test\\java\\DDT\\data.xlsx");
		w.write(fo);
		
		
		f.close();
		
		// data from json
		JSONParser parser = new JSONParser();
		Object o = parser.parse(new FileReader("C:\\Users\\User\\Desktop\\Selenium\\java_selenium\\src\\test\\java\\DDT\\data.json"));
		JSONObject j = (JSONObject) o ;
		System.out.println(j.get("name"));
		System.out.println(j.get("age"));	
		
		// using JDBC
		Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","root");
		System.out.println("Connected to DB");
		
		Statement s = c.createStatement();
		ResultSet r = s.executeQuery("select * from actor");

		while(r.next())
			System.out.println(r.getString(1) + " " + r.getString(2) + " " + r.getString(3) + " " + r.getString(4) + " ");

	
	}
	
	// using xml file
	@Test
	public void xml(XmlTest test) throws FileNotFoundException, IOException, ParseException, SQLException
	{
		System.out.println(test.getParameter("un"));
		System.out.println(test.getParameter("pwd"));
		
//		// data from property file
//				FileInputStream f = new FileInputStream("C:\\Users\\User\\Desktop\\Selenium\\java_selenium\\src\\test\\java\\DDT\\data.properties");
//				Properties p = new Properties();
//				p.load(f);
//				System.out.println(p.getProperty("un"));
//				
//				// data from excel file
//				f = new FileInputStream("C:\\Users\\User\\Desktop\\Selenium\\java_selenium\\src\\test\\java\\DDT\\data.xlsx");
//				Workbook w = WorkbookFactory.create(f);
//				System.out.println(w.getSheet("abc").getRow(1).getCell(0).getNumericCellValue());
//				
//				int numofrows =  w.getSheet("abc").getPhysicalNumberOfRows();
//				System.out.println(numofrows);
//				
//				for(int i = 1 ; i<numofrows ; i++)
//				{
//					System.out.println(w.getSheet("abc").getRow(i).getCell(1).getStringCellValue());
//				}
//				
//				
//				for(int i = 1 ; i<numofrows ; i++)
//				{
//					int x = new Random().nextInt(30);
//					w.getSheet("abc").getRow(i).createCell(4).setCellValue("RCB"+x);
//				}
//				FileOutputStream fo = new FileOutputStream("C:\\Users\\User\\Desktop\\Selenium\\java_selenium\\src\\test\\java\\DDT\\data.xlsx");
//				w.write(fo);
//				
//				
//				f.close();
//				
//				// data from json
//				JSONParser parser = new JSONParser();
//				Object o = parser.parse(new FileReader("C:\\Users\\User\\Desktop\\Selenium\\java_selenium\\src\\test\\java\\DDT\\data.json"));
//				JSONObject j = (JSONObject) o ;
//				System.out.println(j.get("name"));
//				System.out.println(j.get("age"));	
//				
//				// using JDBC
//				Driver d = new com.mysql.cj.jdbc.Driver();
//				DriverManager.registerDriver(d);
//				Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","root");
//				System.out.println("Connected to DB");
//				
//				Statement s = c.createStatement();
//				ResultSet r = s.executeQuery("select * from actor");
//
//				while(r.next())
//					System.out.println(r.getString(1) + " " + r.getString(2) + " " + r.getString(3) + " " + r.getString(4) + " ");

		
	}
	
	
	
	
}
