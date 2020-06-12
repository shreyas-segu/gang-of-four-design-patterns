package factory;

public class Consumer {
    Document document = null;
    String typeOfDocumentGotDynamically;
    DocumentFactory documentFactory = new DocumentFactory();

    public void someMethodWhichNeedsDocument() {
        document = documentFactory.createDocument("PDF");

        if (document != null) {
            String content = document.print();
        }
    }
}
