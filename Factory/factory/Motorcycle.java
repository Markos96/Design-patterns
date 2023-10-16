package factory;
public class Motorcycle implements Vehicle{
    
    @Override
    public void start() {
        System.out.println("Starting motorcycle...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping motorcycle");
    }
}
