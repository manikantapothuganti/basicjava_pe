package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.GuessGame;

public class GuessGameTest {

	@Test
	public void testGg() {
		GuessGame g = new GuessGame();
		String s = g.gg("");
		assertEquals("Please enter an integer",s);
		
	}
	@Test
	public void testGg1() {
		GuessGame g = new GuessGame();
		String s = g.gg("22");
		assertEquals("Entered number is  less than the actual number",s);
		
	}
	@Test
	public void testGg2() {
		GuessGame g = new GuessGame();
		String s = g.gg("24");
		assertEquals("Entered number is greater than the actual number",s);
		
	}
	@Test
	public void testGg3() {
		GuessGame g = new GuessGame();
		String s = g.gg("23");
		assertEquals("Entered number is  equal to the actual number",s);
		
	}
	@Test
	public void testGg4() {
		GuessGame g = new GuessGame();
		String s = g.gg("a");
		assertEquals("Please enter an integer",s);
		
	}
	@Test
	public void testGg5() {
		GuessGame g = new GuessGame();
		String s = g.gg("adhshgfdfg");
		assertEquals("Please enter an integer",s);
		
	}
	@Test
	public void testGg6() {
		
		GuessGame g = new GuessGame();
		String s = g.gg("@#$%^&*()");
		assertEquals("Please enter an integer",s);
		
	}

}
