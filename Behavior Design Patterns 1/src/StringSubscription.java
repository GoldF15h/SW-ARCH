import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow;

public class StringSubscription implements Flow.Subscription {
    private static List<StringSubscriber> subscribers = new ArrayList();

    public  StringSubscription (){

    }

    public void newSubscriber (StringSubscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public void publish (String str){
        for(StringSubscriber subscriber: this.subscribers) {
            subscriber.onNext(str);
        }
    }

    @Override
    public void request(long n) {

    }

    @Override
    public void cancel() {

    }
}
