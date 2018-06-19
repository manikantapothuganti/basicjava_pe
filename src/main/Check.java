package main;
import java.util.Scanner;

public class Check {

	public static String checkc(String s) {
		int n=s.length();
		if (n>1)
		{
			return("Please enter only single character");
		}
		else if (n==0)
		{
			return("please enter anyone single character");
		}
		else 
		{
				char c = s.charAt(0);
				if (Character.isUpperCase(c))
			    {
			    	return("Capital letter");
			    }
				else if (Character.isLowerCase(c))
			    {
			    	return("Small case letter");
			    }
				else if (Character.isDigit(c))
			    {
			    	return("Number");
			    }
				else 
			    {
			    	return("special symbol");
			    }
		}

			

	}

}
