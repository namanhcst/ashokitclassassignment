package com.example.demo.utils;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import com.example.demo.entities.Products;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class PdfUtils {

	public static void export(List<Products> p) throws DocumentException, FileNotFoundException {

		Document document = new Document(PageSize.A4);
        String filePath = "C:\\Users\\Naman\\Desktop\\products\\products.pdf";
        PdfWriter.getInstance(document, new FileOutputStream(filePath));
        
        document.open();
       
        Font f = new Font(Font.HELVETICA, 18, Font.BOLD, Color.RED);
        Phrase ph = new Phrase("Product table", f);
        Paragraph paragraph = new Paragraph(ph);
        paragraph.setAlignment(Element.ALIGN_CENTER);
        paragraph.setSpacingAfter(20f);
        document.add(paragraph);
        PdfPTable table = new PdfPTable(4);
        
        table.setWidthPercentage(100);
        
        PdfPCell cell1 = new PdfPCell();
        cell1.setBackgroundColor(Color.ORANGE);
        cell1.setPhrase(new Phrase("ID"));
        
        PdfPCell cell2 = new PdfPCell();
        cell2.setBackgroundColor(Color.ORANGE);
        cell2.setPhrase(new Phrase("Name"));
        
        PdfPCell cell3 = new PdfPCell();
        cell3.setBackgroundColor(Color.ORANGE);
        cell3.setPhrase(new Phrase("Price"));
        

        PdfPCell cell4 = new PdfPCell();
        cell4.setBackgroundColor(Color.ORANGE);
        cell4.setPhrase(new Phrase("Category"));
        
        table.addCell(cell1);
        table.addCell(cell2);
        table.addCell(cell3);
        table.addCell(cell4);
        
        p.forEach(product->{
        	
        	table.addCell(product.getId().toString());
        	table.addCell(product.getName());
        	table.addCell(String.valueOf(product.getPrice()));
        	table.addCell(product.getCat());

        	
        });
        document.add(table);
        
        document.close();

        
        

        
	}

}
