package main;
import java.util.*;

public class ReverseString {

	public String rs(String s) {
		String str="";
		char a[] = new char[s.length()];
		for (int i=0;i<s.length();i++)
		{
			a[i]=s.charAt(i);
		}
		for (int i=s.length()-1;i>=0;i--)
		{
			str = str.concat(a[i]+"");
		}
		return str;

	}

}
