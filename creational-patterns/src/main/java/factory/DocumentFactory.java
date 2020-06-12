package factory;

public class DocumentFactory {
    public Document createDocument(String typeOfDocument) {
        switch (typeOfDocument) {
            case "PDF":
                return new PDFDocument();
            case "HTML":
                return new HTMLDocument();
            default:
                return null;
        }
    }
}
