public class Main{

    public static void main(String[] args) {

        // Implementation of Singleton Pattern 

        Person person = Person.getInstance();
        Person person2 = Person.getInstance();

        
        
        //Validate instances of the application
         
        System.out.println(person == person2);

    }
}