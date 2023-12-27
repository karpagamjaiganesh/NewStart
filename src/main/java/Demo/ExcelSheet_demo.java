package Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.sl.usermodel.*;
import org.apache.poi.ss.usermodel.*;

import org.apache.poi.xssf.usermodel.*;

public class ExcelSheet_demo {

	public static void writeexcel() throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		// spreadsheet object
		XSSFSheet spreadsheet = workbook.createSheet(" Student Data ");
		// creating a row object
		XSSFRow row;
		// This data needs to be written (Object[])
		Map<String, Object[]> studentData = new TreeMap<String, Object[]>();
		studentData.put("1", new Object[] { "Roll No", "NAME", "Year" });
		studentData.put("2", new Object[] { "128", "Aditya", "2nd year" });
		studentData.put("3", new Object[] { "129", "Narayana", "2nd year" });
		studentData.put("4", new Object[] { "130", "Mohan", "2nd year" });
		studentData.put("5", new Object[] { "131", "Radha", "2nd year" });
		studentData.put("6", new Object[] { "132", "Gopal", "2nd year" });
		studentData.put("7", new Object[] { "133", "Gita", "2nd year" });
		Set<String> keyid = studentData.keySet();
		int rowid = 0;
		// writing the data into the sheets...
		for (String key : keyid) {
			row = spreadsheet.createRow(rowid++);
			Object[] objectArr = studentData.get(key);
			int cellid = 0;

			for (Object obj : objectArr) {
				Cell cell = row.createCell(cellid++);
				cell.setCellValue((String) obj);
			}
		}

		// .xlsx is the format for Excel Sheets...
		// writing the workbook into the file...
		String fi = "./Newproj.xlsx";
		File file = new File(fi);
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);
		out.close();
	}

	public static void readexcel() throws IOException {
		
		  FileInputStream file = new FileInputStream("./Newproj.xlsx"); 
		  XSSFWorkbook  workbook = new XSSFWorkbook(file); 
		  XSSFSheet sheet = workbook.getSheetAt(0);
		  int rows = sheet.getLastRowNum();
		  int cellnumb = sheet.getRow(0).getLastCellNum(); 
		  XSSFRow row; 
		  for (int i = 0; i <= rows; i++) 
		  { row = sheet.getRow(i);
		  for (int j = 0; j < cellnumb; j++)
		  { XSSFCell  cell = row.getCell(j); 
		  String cellvalue = cell.getStringCellValue();
		  System.out.println(cellvalue); } } 
		  workbook.close();
		 }

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		writeexcel();
		readexcel();
	}
}
