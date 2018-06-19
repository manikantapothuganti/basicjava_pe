package main;
import java.util.Scanner;

public class TomJerry {

	public static void main(String[] args) {
		int a;
		Scanner sn = new Scanner(System.in);
		a=sn.nextInt();
		if (((a%2)!=0)&&(a>20)&&(a<30))
		{
			System.out.println("Tom");
		}
		else if (((a%2)==0)&&(a>20)&&(a<30))
		{
			System.out.println("Jerry");
		}

	}

}
