public class main {

    public static void main(String[] args){

        AlphabetSubscriber alpSub = new AlphabetSubscriber();
        NumberSubscriber numSub = new NumberSubscriber();
        SymbolSubscriber symSub = new SymbolSubscriber();

        StringSubscription subPool = new StringSubscription();

        StringPublisher strPub = new StringPublisher(subPool);

        strPub.newMember(alpSub);
        strPub.newMember(numSub);
        strPub.newMember(symSub);

        strPub.publishToSubscriber("Publist");
        strPub.publishToSubscriber("Publ15t123");
        strPub.publishToSubscriber("Publist><");
        strPub.publishToSubscriber("ABCDEFG");
        strPub.publishToSubscriber("123456");
        strPub.publishToSubscriber("@_><");

    }

}
