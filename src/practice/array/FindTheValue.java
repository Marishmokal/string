package practice.array;

import java.util.Scanner;

public class FindTheValue
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int[] age = new int[5];
		for (int i = 0; i < age.length; i++)
		{
			System.out.println("enter any number");
			age[i] = s.nextInt();
		}
		for (int i = 0; i < age.length; i++) 
		{
			if (age[i] > 80 && age[i] < 90) 
			{
				System.out.println("value between 80 to 90");
			} else
				System.out.println("out of values");
		}
	}
}
