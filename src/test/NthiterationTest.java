package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Nthiteration;

public class NthiterationTest {

	@Test
	public void testNth() {
		Nthiteration n = new Nthiteration();
		String s = n.nth("5");
		assertEquals("1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ",s);
	}
	@Test
	public void testNth1() {
		Nthiteration n = new Nthiteration();
		String s = n.nth("");
		assertEquals("Enter an Integer",s);
	}
	@Test
	public void testNth2() {
		Nthiteration n = new Nthiteration();
		String s = n.nth("as");
		assertEquals("Enter an Integer",s);
	}
	@Test
	public void testNth3() {
		Nthiteration n = new Nthiteration();
		String s = n.nth("#$%%^%");
		assertEquals("Enter an Integer",s);
	}

}