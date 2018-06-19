package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.RepeatString;

public class RepeatStringTest {

	@Test
	public void testRs() {
		RepeatString r = new RepeatString();
		String s = r.rs("Stackroute","5");
		assertEquals("Stackrouterouterouterouterouteroute",s);
	}
	
	@Test
	public void testRs1() {
		RepeatString r = new RepeatString();
		String s = r.rs("Stackroute","hdhkfhdkjf");
		assertEquals("please Enter an Integer in the 2nd input",s);
	}
	@Test
	public void testRs2() {
		RepeatString r = new RepeatString();
		String s = r.rs("Stackroute","$%^&*(");
		assertEquals("please Enter an Integer in the 2nd input",s);
	}
	@Test
	public void testRs3() {
		RepeatString r = new RepeatString();
		String s = r.rs("test","3");
		assertEquals("testestestest",s);
	}
	
	@Test
	public void testRs4() {
		RepeatString r = new RepeatString();
		String s = r.rs("test","4");
		assertEquals("testtesttesttesttest",s);
	}
	@Test
	public void testRs5() {
		RepeatString r = new RepeatString();
		String s = r.rs("test","5");
		assertEquals("Enter entered value is more that string size",s);
	}
	@Test
	public void testRs6() {
		RepeatString r = new RepeatString();
		String s = r.rs("test","-1");
		assertEquals("string size can't be negative",s);
	}
	@Test
	public void testRs7() {
		RepeatString r = new RepeatString();
		String s = r.rs("test","0");
		assertEquals("test",s);
	}
	
	

}
