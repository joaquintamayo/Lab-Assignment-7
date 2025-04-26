class PdfDocument implements Document {
    private String fileName;
    private String author;
    private int pageCount;
    private String name;

    public PdfDocument() {
        System.out.println("Creating a PDF Document prototype.");
    }

    private PdfDocument(PdfDocument prototype) {
        this.fileName = prototype.fileName;
        this.author = prototype.author;
        this.pageCount = prototype.pageCount;
        this.name = prototype.name;
    }

    public void setFileName(String fileName) { this.fileName = fileName; }
    public void setAuthor(String author) { this.author = author; }
    public void setPageCount(int pageCount) { this.pageCount = pageCount; }

    @Override
    public PdfDocument clone() {
        return new PdfDocument(this);
    }

    @Override
    public void open() {
        System.out.printf("Opening PDF Document: %s by %s (%d pages)%n", fileName, author, pageCount);
    }

    @Override
    public String getType() {
        return "PDF";
    }
}
