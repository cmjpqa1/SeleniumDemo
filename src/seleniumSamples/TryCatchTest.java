package seleniumSamples;

public class TryCatchTest {

	public static void main(String[] args) {
		try {
	        int i =  Integer.parseInt("Test1");
	    }
	    catch (NumberFormatException e) {
	         System.out.print("Mywrong");

	    }
	}
}
