import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {
	public static void main(String[] args) {
		Result resultThird = JUnitCore.runClasses(Union.class);
		for(Failure failure : resultThird.getFailures()) {
			System.out.println("Test failed at " + failure);
		}
	}
}