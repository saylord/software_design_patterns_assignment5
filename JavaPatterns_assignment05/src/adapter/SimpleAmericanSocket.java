package adapter;

public class SimpleAmericanSocket implements AmericanSocket{
    @Override
    public void getPower() {
        System.out.println("Get 110 volt.");
    }
}
