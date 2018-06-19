package main;
import java.util.Scanner;

public class Nthiteration {

	public static  String nth(String a) {
		try {
			Integer.parseInt(a);
		}
		catch (Exception e) {
			return ("Enter an Integer");
		}
		String str ="";
		for (int i=1;i<=Integer.parseInt(a);i++)
		{
			for (int j=1;j<=i;j++)
			{
				 str = str.concat(i+" ");
			}
		}
		return str;
	}

}
