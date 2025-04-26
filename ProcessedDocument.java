public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();

        Document pdf1 = registry.createPdf("annual_report_2024.pdf", "Acme Corp", 150);
        pdf1.open();
        System.out.println("Type: " + pdf1.getType() + ", File: annual_report_2024.pdf, Author: Acme Corp, Pages: 150\n");

        Document text1 = registry.createText("meeting_notes.txt", "UTF-8", 250);
        text1.open();
        System.out.println("Type: " + text1.getType() + ", Path: meeting_notes.txt, Encoding: UTF-8, Words: 250\n");

        Document sheet1 = registry.createSpreadsheet("sales_data_q1.xlsx", 1000, 20);
        sheet1.open();
        System.out.println("Type: " + sheet1.getType() + ", Name: sales_data_q1.xlsx, Rows: 1000, Columns: 20\n");

        Document pdf2 = registry.createPdf("summary_report.pdf", "Acme Corp", 30);
        pdf2.open();
    }
}