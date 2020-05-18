package clinic.programming.training;
import org.apache.commons.lang3.StringUtils;
public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
    }

	public int countWords(String words)
	{
		String[] separatewords = StringUtils.split(words," ");
		return (separatewords == null) ? 0 : separatewords.length;
	}
    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		System.out.println ("Hello world, welcome to my Application");
		Application app = new Application();
		int count = app.countWords("How are you doing");
		System.out.println("Number of words are " + count);
    }
}