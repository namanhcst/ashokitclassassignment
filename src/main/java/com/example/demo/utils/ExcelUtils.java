package com.example.demo.utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.example.demo.entities.BookTable;

public class ExcelUtils {

	public static void pushData(List<BookTable> bookdata) {
		String filePath = "C:\\Users\\Naman\\Desktop\\bookexcel\\bookexel.xlsx";

		try (Workbook workbook = new XSSFWorkbook(); FileOutputStream fos = new FileOutputStream(filePath)) {

			Sheet sheet = workbook.createSheet("bookTable");

			AtomicInteger rowIndex = new AtomicInteger(0);

			bookdata.forEach(bookRow -> {

				Row row = sheet.createRow(rowIndex.getAndIncrement());

				row.createCell(0).setCellValue(bookRow.getId());
				row.createCell(1).setCellValue(bookRow.getBookName());
				row.createCell(2).setCellValue(bookRow.getBookValue());
				row.createCell(3).setCellValue(bookRow.getBookCategory());

			});

			workbook.write(fos);
			System.out.println("Excel file saved successfully to: " + filePath);
		} catch (IOException e) {
		    e.printStackTrace();

		}

	}

}
