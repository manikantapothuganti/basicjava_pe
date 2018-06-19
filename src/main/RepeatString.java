package main;
import java.util.*;

public class RepeatString {

	public String rs(String s,String n) {
		try {
			Integer.parseInt(n);
		}
		catch (Exception e) {
			return ("please Enter an Integer in the 2nd input");
		}
		if (Integer.parseInt(n)>s.length()) {
			return ("Enter entered value is more that string size");
		}
		else if (Integer.parseInt(n)<0)
		{
			return ("string size can't be negative");
		}
		int k=0;
		String str="";
		int j=s.length()-Integer.parseInt(n);
		char z[] = new char[s.length()];
		for (int i=j;i<s.length();i++)
		{
			z[k]=s.charAt(i);
			k++;
		}
		
		for (int x=0;x<Integer.parseInt(n);x++)
		{
			for (int y=0;y<Integer.parseInt(n);y++)
			{
				str = str.concat(z[y]+"");
			}
		}
		return s.concat(str);

	}

}
