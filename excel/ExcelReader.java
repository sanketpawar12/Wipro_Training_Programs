package excel;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("testdata.xlsx");
             Workbook wb = WorkbookFactory.create(fis)) {

            Sheet sheet = wb.getSheet("LoginData");

            int rows = sheet.getLastRowNum(); // last row index
            for (int i = 1; i <= rows; i++) { // start from 1 (skip header)
                Row row = sheet.getRow(i);
                if (row != null) {
                    DataFormatter df = new DataFormatter(); // handles string/numeric
                    String user = df.formatCellValue(row.getCell(0));
                    String pass = df.formatCellValue(row.getCell(1));
                    System.out.println(user + " | " + pass);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
