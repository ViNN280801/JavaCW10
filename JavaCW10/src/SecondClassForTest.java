import static org.junit.Assert.assertNull;

import org.junit.Test;

public class SecondClassForTest {
	private String stringForTest = "This string isn't null!";
	
	public boolean isNull(String string) {
		if(string == null) 
			return true;
		else 
			return false;
	}
	@Test
    public void isStringNull() {
    	assertNull(isNull(stringForTest));
    }
}