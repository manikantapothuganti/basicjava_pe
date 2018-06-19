package main;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		long a;
		int j=0,z=0;
		Scanner sn = new Scanner(System.in);
		System.out.print("Input :");
		a = sn.nextLong();
		String s = Long.toString(a);
		String p[] = s.split("");
		for (int i=0;i<s.length();i++)
		{
			if(Integer.valueOf(p[i])==Integer.valueOf(p[s.length()-1-i]))
			{
				j++;
			}
		}
		for (int i=0;i<s.length();i++)
		{
			if(Integer.valueOf(p[i])%2==0)
			{
				z=z+Integer.valueOf(p[i]);
			}
		}
		if ((j==s.length())&&(z>25))
		{
			System.out.format("%d is palindrome and the sum of even numbers is greater than 25",a);
		}
		else if ((j==s.length())&&(z<25))
		{
			System.out.format("%d is palindrome and the sum of even numbers is less than 25",a);
		}
		else 
		{
			System.out.format("%d is not palindrome",a);
		}
		
		

	}

}
