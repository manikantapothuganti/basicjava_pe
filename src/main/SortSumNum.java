package main;
import java.util.Arrays;
import java.util.Scanner;

public class SortSumNum {

	public static void main(String[] args) {
		int a,sum=0;
		Scanner sn = new Scanner(System.in);
		a=sn.nextInt();
		String s = Integer.toString(a);
		int z[] = new int [s.length()];
		for (int i=0; i <s.length();i++)
		{
			z[i]=a%10;
			if (z[i]%2==0)
			{
				sum=sum+z[i];
			}
			a=a/10;
		}
		Arrays.sort(z);
		System.out.print("Sorted number in non-increasing order : ");
		for (int i=s.length()-1; i>=0;i--)
		{
			System.out.print(z[i]);
		}
		System.out.println();
		System.out.println(" Sum of even numbers : "+sum);
		if (sum>10)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}

	}

}
