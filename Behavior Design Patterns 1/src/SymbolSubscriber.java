import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.concurrent.Flow;

public class SymbolSubscriber extends StringSubscriber{
    File file;
    public SymbolSubscriber(){
        super();
        this.file = new File(Paths.get(System.getProperty("user.dir"), "src","SymbolPublish.txt").toString());
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {

    }

    @Override
    public void onNext(Object item) {
        if (item.toString().matches("(.*)[^a-zA-z0-9](.*)")) {
            System.out.println("SymbolSubscriber RECIVED : " + item);
            try {
                FileWriter fWriter = new FileWriter(this.file, true);

                fWriter.write(item + "\n");
                fWriter.flush();
                fWriter.close();

                System.out.println("FILE WRITTEN");
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }
}
