class SpreadsheetDocument implements Document {
    private String spreadsheetName;
    private int rowCount;
    private int columnCount;

    public SpreadsheetDocument() {
        System.out.println("Creating a Spreadsheet Document prototype.");
    }

    private SpreadsheetDocument(SpreadsheetDocument prototype) {
        this.spreadsheetName = prototype.spreadsheetName;
        this.rowCount = prototype.rowCount;
        this.columnCount = prototype.columnCount;
    }

    public void setSpreadsheetName(String name) { this.spreadsheetName = name; }
    public void setRowCount(int rows) { this.rowCount = rows; }
    public void setColumnCount(int cols) { this.columnCount = cols; }

    @Override
    public SpreadsheetDocument clone() {
        return new SpreadsheetDocument(this);
    }

    @Override
    public void open() {
        System.out.printf("Opening Spreadsheet Document: %s (%d rows, %d columns)%n", spreadsheetName, rowCount, columnCount);
    }

    @Override
    public String getType() {
        return "Spreadsheet";
    }
}