package practice.array;

import java.util.Scanner;

public class AdditionOfEvenNum 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int[] a = new int[10];
		int sum = 0;
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("enter the value");
			a[i] = s.nextInt();
		}
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]%2==0)
			{
				sum=sum+a[i];
			}
		}
		System.out.println("addition is:-" + sum);
	}
}
