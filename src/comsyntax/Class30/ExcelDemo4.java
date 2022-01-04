package comsyntax.Class30;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class ExcelDemo4 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\12037\\OneDrive\\Documents\\IntelliJ Config files\\Batch112.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet1 = xssfWorkbook.getSheet("Sheet1");
        int noOfRows = sheet1.getPhysicalNumberOfRows(); //the number of rows from the sheet
        List<Map<String, String>> excelData = new ArrayList<>();
        System.out.println(noOfRows);
        Row row0=sheet1.getRow(0);
        for (int i = 1; i < noOfRows; i++) {
            XSSFRow row = sheet1.getRow(i);
            HashMap<String, String> hashMap = new LinkedHashMap<>();
           // int noCells = row.getPhysicalNumberOfCells();
            hashMap.put(row0.getCell(0).toString(),row.getCell(0).toString());
            hashMap.put(row0.getCell(1).toString(),row.getCell(1).toString());
            hashMap.put(row0.getCell(2).toString(),row.getCell(2).toString());
            hashMap.put(row0.getCell(3).toString(),row.getCell(3).toString());
            excelData.add(hashMap);
        }
        System.out.println(excelData);
    }
}
