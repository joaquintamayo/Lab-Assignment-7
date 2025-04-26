class DocumentRegistry {
    private Document pdfPrototype;
    private Document textPrototype;
    private Document spreadsheetPrototype;

    public DocumentRegistry() {
        pdfPrototype = new PdfDocument();   
        textPrototype = new TextDocument();
        spreadsheetPrototype = new SpreadsheetDocument(); 
    }

    public Document createPdf(String fileName, String author, int pageCount) {
        PdfDocument doc = (PdfDocument) pdfPrototype.clone();
        doc.setFileName(fileName);
        doc.setAuthor(author);
        doc.setPageCount(pageCount);
        return doc;
    }

    public Document createText(String path, String encoding, int wordCount) {
        TextDocument doc = (TextDocument) textPrototype.clone();
        doc.setFilePath(path);
        doc.setEncoding(encoding);
        doc.setWordCount(wordCount);
        return doc;
    }

    public Document createSpreadsheet(String name, int rows, int columns) {
        SpreadsheetDocument doc = (SpreadsheetDocument) spreadsheetPrototype.clone();
        doc.setSpreadsheetName(name);
        doc.setRowCount(rows);
        doc.setColumnCount(columns);
        return doc;
    }
}