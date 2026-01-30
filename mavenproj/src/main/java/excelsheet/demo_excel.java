package excelsheet;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class demo_excel {
	
	public  static void main(String[] args)throws IOException
	{
		
		
String prjpath = System.getProperty("user.dir");
FileInputStream fis = new FileInputStream("/home/labuser/Desktop/Project/excel_venna.xlsx");
XSSFWorkbook v = new XSSFWorkbook(fis);
XSSFSheet sheet = v.getSheet("sheet1");

System.out.println(sheet.getLastRowNum());
System.out.println(sheet.getRow(3).getCell(0).getStringCellValue());
//System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
sheet.getRow(4).createCell(2).setCellValue("Fail");


FileOutputStream fout = new FileOutputStream(prjpath + "/home/labuser/Desktop/Project/excel_venna.xlsx");
v.write(fout);
v.close();




}
}
