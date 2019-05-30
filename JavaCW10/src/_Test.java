import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert.*;

public class _Test {
	private ClassForTest test;
	private SecondClassForTest sTest;
	private String stringForTest;
	 
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before class");
    }
 
    @AfterClass
    public  static void afterClass() {
        System.out.println("After class");
    }
 
    @Before
    public void initTest() {
    	test = new ClassForTest();
    }
 
    @After
    public void afterTest() {
    	test = null;
    }
    @Test
    public void compareTwoStrings() {
    	assertEquals(true, test.stringCompare("FFF", "F"));
    }
    @Test
    public void isStringNull() {
    	assertNull(sTest.isNull(stringForTest));
    }
    @Ignore("Message for ignored test")
    @Test
    public void ignoredTest() {
        System.out.println("Will not print it");
    }
 
    @Test(timeout = 500)
    public void timeStampTest() {
        while (true);
    }
}