public class Person {

    private static volatile Person instance;

    // Construct must always be private 

    private Person() {
    }

    /*
     * 
     * Returns the single instance of the Singleton class. 
     *  
     * @return Unique instance of application.
     */

    public static Person getInstance() {
        if (instance == null) {
            synchronized (Person.class) {
                if (instance == null) {
                    instance = new Person();
                }
            }
        }
        return instance;
    }


    public void hello(){
        System.out.println("Hello!");
    }
}
