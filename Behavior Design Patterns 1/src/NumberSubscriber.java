import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.concurrent.Flow;

public class NumberSubscriber extends StringSubscriber{
    File file;
    public NumberSubscriber(){
        super();
        this.file = new File(Paths.get(System.getProperty("user.dir"), "src","NumberPublish.txt").toString());
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {

    }

    @Override
    public void onNext(Object item) {
        if (item.toString().matches("(.*)[0-9](.*)")) {
            System.out.println("NumberSubscriber RECIVED : " + item);
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
