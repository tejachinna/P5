package Demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromMethodChaininhg {

	public static void main(String[] args) throws IOException {
		FileInputStream fis =new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
        double data = wb.getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue();
		System.out.println(data);
		wb.close();
		
	}

}
