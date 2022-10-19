package team25.team25;

import java.io.FileOutputStream;
import java.net.URL;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;

public class createTemplate {
	
	static int FONT_SIZE_SMALL = 16;
	static int FONT_SIZE_BIG = 32;
	static int OFFSET = 40;
	public void create() throws Exception {
        Document document = new Document();

        Font font1 = new Font(Font.FontFamily.HELVETICA, 
                FONT_SIZE_BIG, Font.BOLD);
        Font font2 = new Font(Font.FontFamily.HELVETICA, 
                FONT_SIZE_SMALL, Font.ITALIC | Font.UNDERLINE);

        PdfWriter.getInstance(document, 
                new FileOutputStream("template.pdf"));

        document.open();

        // ���������������� ��������
        Paragraph title = new Paragraph("Receipt", font1);
        title.setAlignment(Element.ALIGN_CENTER);
        title.setSpacingAfter(FONT_SIZE_BIG);
        document.add(title);

        // �������� � �������
        Paragraph purpose = new Paragraph("Purpose", font2);
        purpose.setSpacingAfter(FONT_SIZE_BIG);
        document.add(purpose);

        // �������� � ����������� ������ ������
        Paragraph amount = new Paragraph();
        amount.setFont(font2);
        amount.setSpacingAfter(8);
        amount.add(new Chunk("Amount"));
        document.add(amount);

        // �������� � ������, � ������� �������� ����
        Paragraph date = new Paragraph();
        date.setFont(font2);
        Phrase phrase = new Phrase();
        phrase.add(new Chunk("Date"));
        date.add(phrase);
        document.add(date);

        document.add(new Paragraph("Name", font2));

        Paragraph footer = new Paragraph(
            "Important - please retain for your records - ");

        // ������
        Anchor anchor = new Anchor("Javenue");
        anchor.setReference("http://www.javenue.info");
        footer.add(anchor);

        footer.setAlignment(Element.ALIGN_CENTER);
        footer.setSpacingBefore(FONT_SIZE_BIG);
        document.add(footer);

        // ��������, ����������� �� URL
        String imageUrl = "http://www.javenue.info/files/sample.png";
        // Image.getInstance("sample.png")
        Image stamp = Image.getInstance(new URL(imageUrl)); 
        stamp.setAlignment(Element.ALIGN_RIGHT);
        document.add(stamp);

        document.close();
    }

}
