package creational;

import java.io.IOException;

public class CSVBookMetadataExporter extends BookMetadataExporter {

    protected BookMetadataFormatter getFormatter() throws IOException{
        return new CSVBookMetadataFormatter();
    }
}