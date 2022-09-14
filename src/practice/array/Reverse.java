package practice.array;

import java.util.Scanner;

public class Reverse {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	
	int []a=new int[5];
	for(int i=0;i<a.length;i++)
	{
		System.out.println("enter any number");
		a[i]=s.nextInt();	
	}

	System.out.println("reverse arrey is:-");
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.println(a[i]);
	}
}
}
