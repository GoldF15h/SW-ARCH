import java.util.concurrent.Flow;

public class StringPublisher implements Flow.Publisher {

    StringSubscription subPool ;

    public StringPublisher(StringSubscription newSubPool){
        this.subPool = newSubPool;
    }

    public void newMember (StringSubscriber newSub){
        this.subPool.newSubscriber(newSub);
    }

    public void publishToSubscriber(String pubStr){
        this.subPool.publish(pubStr);
    }

    @Override
    public void subscribe(Flow.Subscriber subscriber) {

    }
}
