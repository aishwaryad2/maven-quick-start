package clinic.programming.training;

public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		System.out.println ("Hello world, welcome to my Application");
		Application app = new Application();
    }
}