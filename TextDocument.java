class TextDocument implements Document {
    private String filePath;
    private String encoding;
    private int wordCount;

    public TextDocument() {
        System.out.println("Creating a Text Document prototype.");
    }

    private TextDocument(TextDocument prototype) {
        this.filePath = prototype.filePath;
        this.encoding = prototype.encoding;
        this.wordCount = prototype.wordCount;
    }

    public void setFilePath(String filePath) { this.filePath = filePath; }
    public void setEncoding(String encoding) { this.encoding = encoding; }
    public void setWordCount(int wordCount) { this.wordCount = wordCount; }

    @Override
    public TextDocument clone() {
        return new TextDocument(this);
    }

    @Override
    public void open() {
        System.out.printf("Opening Text Document: %s with encoding: %s (%d words)%n", filePath, encoding, wordCount);
    }

    @Override
    public String getType() {
        return "Text";
    }
}