package practice.array;

import java.util.Scanner;

public class NegativeAndPositive {
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	int[]age=new int[5];
	for(int i=0;i<age.length;i++)
	{
		System.out.println("enter any number");
		age[i]=s.nextInt();
	}
	for(int i=0;i<age.length;i++)
	{
		if(age[i]>0)
		{
			System.out.println("positive number" +age[i]);
		}
		else
			System.out.println("negative number" +age[i]);
	}
	
}
}
