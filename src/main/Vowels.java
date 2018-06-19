package main;
import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		String s;
		Scanner sn = new Scanner(System.in);
		s=sn.nextLine();
		for (int i=0;i<s.length();i++)
		{
			if ((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='u'))
			{
				System.out.print("Vowel ");
			}
			else 
			{
				System.out.print("consonant  ");
			}
		}
		

	}

}
