package factory;
public class Truck implements Vehicle{
    
    @Override
    public void start() {
        System.out.println("Starting truck");
    }

    @Override
    public void stop() {
        System.out.println("Stopping truck");
    }   
}
