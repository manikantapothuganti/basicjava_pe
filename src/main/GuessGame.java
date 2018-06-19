package main;
import java.util.Scanner;

public class GuessGame {

	public static String  gg(String a) {
		System.out.println("Guess the number Limit : 1 to 50 ");
		try {
			Integer.valueOf(a);
		}
		catch (Exception e)
		{
			return ("Please enter an integer");
		}
		if ((Integer.valueOf(a)<1)||(Integer.valueOf(a)>50))
		{
			
			return ("Entered number is out of bounds");
		}
		else if (Integer.valueOf(a)>23)
		{
			return ("Entered number is greater than the actual number");
		}
		else if (Integer.valueOf(a)<23)
		{
			return ("Entered number is  less than the actual number");
		}
		else if (Integer.valueOf(a)==23)
		{
			return ("Entered number is  equal to the actual number");
		}
		else 
		{
			return ("Please enter an integer");
		}
		

	}

}
