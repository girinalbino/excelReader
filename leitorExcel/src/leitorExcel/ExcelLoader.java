package leitorExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ExcelLoader {	

	public static void main(String[] args) throws IOException {
		FileInputStream arquivo = new FileInputStream(new File("input/nota.xls"));
		HSSFWorkbook workbook = new HSSFWorkbook(arquivo);
		HSSFSheet sheetAlunos = workbook.getSheetAt(0);
		Iterator<Row> rowIterator = sheetAlunos.iterator();
		XPIProbe probe = new XPIProbe();
		
		while (rowIterator.hasNext()) {
			Row row = rowIterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				probe.processaCelula(cell);					
			}
		}

		arquivo.close();
	}
}
