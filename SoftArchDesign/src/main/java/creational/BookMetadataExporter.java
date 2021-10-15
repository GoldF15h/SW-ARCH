package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.PrintStream;

public abstract class BookMetadataExporter extends BookCollection {

    public void export(PrintStream stream) throws ParserConfigurationException, IOException{
        BookMetadataFormatter allBook  = getFormatter();
        for(Book book:books){
            allBook.append(book);
        }
        stream.print(allBook.getMetadataString());
    }

    protected abstract BookMetadataFormatter getFormatter() throws ParserConfigurationException, IOException;

}