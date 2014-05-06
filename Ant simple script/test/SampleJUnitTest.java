import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class SampleJUnitTest {

	public SampleJUnitTest() {
	}

	/**
	 * Examples of JUnit @Test usage.
	 */
	@Test
	public void testExecute() {
		
	} 
	
	/**
	 * Examples of JUnit assertions usage.
	 */
	@Test
	public void testExecuteAsserts() {
		int a = 1;
		int b = 1;
		int c = 2;

		assertTrue(a == b);
		assertFalse(a == c);
		
		String abcd = "abcd";
		
		assertEquals("abcd",abcd);
		
		String abcdNull = null;
		
		assertNull(abcdNull);
		assertNotNull(abcd);
}
	
	/**
	 * Examples of JUnit expected exception usage.
	 */
	@Test(expected = Exception.class)
	public void testExecuteExpectedException() throws Exception {
		throw new Exception();
	}
}
