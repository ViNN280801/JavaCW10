import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClassForTest {
	public boolean stringCompare(String string1, String string2) {
		if(string1 == string2)
			return true;
		else 
			return false;
	}
	@Test
    public void compareTwoStrings() {
    	assertEquals(true, stringCompare("FFF", "F"));
    }
}