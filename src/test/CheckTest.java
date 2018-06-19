package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.Check;

public class CheckTest {


	@Test
	public void testCheckc() {
		Check c = new Check();
		String s= c.checkc("a");
		assertEquals("Small case letter",s);
		
	}
	@Test
	public void testCheckc1() {
		Check c = new Check();
		String s= c.checkc("A");
		assertEquals("Capital letter",s);
		
	}
	@Test
	public void testCheckc2() {
		Check c = new Check();
		String s= c.checkc("0");
		assertEquals("Number",s);
		
	}
	@Test
	public void testCheckc3() {
		Check c = new Check();
		String s= c.checkc("*");
		assertEquals("special symbol",s);
		
	}
	@Test
	public void testCheckc4() {
		Check c = new Check();
		String s= c.checkc("hvhjdjhdfhjsfh");
		assertEquals("Please enter only single character",s);
		
	}
	@Test
	public void testCheckc5() {
		Check c = new Check();
		String s= c.checkc("6536573657357");
		assertEquals("Please enter only single character",s);
		
	}
	@Test
	public void testCheckc6() {
		Check c = new Check();
		String s= c.checkc("!@#$%^&*()");
		assertEquals("Please enter only single character",s);
		
	}
	@Test
	public void testCheckc7() {
		Check c = new Check();
		String s= c.checkc("");
		assertEquals("please enter anyone single character",s);
		
	}

}
