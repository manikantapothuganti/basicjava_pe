package main;
import java.util.Scanner;

public class NonInt {

	public static void main(String[] args) {
		int a=0,sum=0;
		Scanner sn = new Scanner(System.in);
		System.out.println("enter the number of number u wanna input");
		int n=sn.nextInt();
		for (int i=0;i<n;i++)
		{
			System.out.println("enter the number");
			a=sn.nextInt();
			sum=sum+a;
		}
		System.out.println(sum);

	}

}
