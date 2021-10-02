package utils;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class ExcelUtils {

    public static ArrayList<ArrayList<String>> readRows(String sheetName, String fileName) {
        ArrayList<ArrayList<String>> rowsList = new ArrayList<>();
        String path = "src/main/resources/data/" + fileName;
        try {
            File file = new File(path);
            FileInputStream fileInputStream = new FileInputStream(file);
            Workbook workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheet(sheetName);

            //getting each row and storing in a users list
            for(int i = 0; i <= sheet.getLastRowNum(); i++){
                ArrayList<String> rowCells = new ArrayList<>();
                Row row = sheet.getRow(i);

                //getting each cell and storing in a rowCells List
                for(int j = 0; j < row.getLastCellNum(); j++){
                    Cell cell = row.getCell(j);
                    rowCells.add(cell.toString());
                }

                rowsList.add(rowCells);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }
        return rowsList;
    }
}
