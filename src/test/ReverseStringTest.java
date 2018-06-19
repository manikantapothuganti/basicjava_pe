package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.ReverseString;

public class ReverseStringTest {

	@Test
	public void testRs() {
		ReverseString r = new ReverseString();
		String s = r.rs("london");
		assertEquals("nodnol",s);
	}
	

}
