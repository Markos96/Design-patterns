package factory;
public class Car implements Vehicle{

    @Override
    public void start() {
        System.out.println("Starting car...");
    }

    @Override
    public void stop() {
        System.out.println("Stoping car...");
    }

}