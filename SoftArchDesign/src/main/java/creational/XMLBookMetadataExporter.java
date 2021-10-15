package creational;

import javax.xml.parsers.ParserConfigurationException;

public class XMLBookMetadataExporter extends BookMetadataExporter {

    protected BookMetadataFormatter getFormatter() throws ParserConfigurationException {
        return new XMLBookMetadataFormatter();
    }
}