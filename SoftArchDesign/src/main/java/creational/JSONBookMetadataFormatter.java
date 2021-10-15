package creational;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    private JSONObject JSONObjectobj;
    private JSONArray JSONArray;

    public JSONBookMetadataFormatter(){
        this.reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        JSONObjectobj = new JSONObject();
        JSONArray = new JSONArray();
        JSONObjectobj.put(Book.class.getSimpleName() + "s",JSONArray);
        return null;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        try {
            JSONObject newObj = new JSONObject();
            newObj.put(Book.Metadata.getValue(Book.Metadata.ISBN) ,b.getISBN());
            newObj.put(Book.Metadata.getValue(Book.Metadata.TITLE),b.getTitle());
            newObj.put(Book.Metadata.getValue(Book.Metadata.PUBLISHER),b.getPublisher());

            JSONArray authorsArr = new JSONArray();
            for (String authName : b.getAuthors()) {
                authorsArr.add(authName);
            }

            newObj.put(Book.Metadata.getValue(Book.Metadata.AUTHORS),authorsArr);
            JSONArray.add(newObj);
        }catch (Exception error){
            error.printStackTrace();
        }

        return this;
    }

    @Override
    public String getMetadataString() {
        return JSONObjectobj.toString();
    }
}