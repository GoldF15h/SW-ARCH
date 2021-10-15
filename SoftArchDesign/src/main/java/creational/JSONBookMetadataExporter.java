package creational;


public class JSONBookMetadataExporter extends BookMetadataExporter {

    protected BookMetadataFormatter getFormatter() {
        return new JSONBookMetadataFormatter();
    }
}