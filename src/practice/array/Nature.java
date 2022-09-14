package practice.array;

import java.util.Scanner;

public class Nature {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int[]a=new int[5];
	int[]b=new int[5];
	int p1=0;
	int p2=0;
for(int i=0;i<a.length;i++)
{
	System.out.println("enter any number");
	a[i]=s.nextInt();
}
for(int i=0;i<a.length;i++)
{
	if(a[i]<0)
	{
		System.out.println(a[i]+ " negative number");
		p1++;
	}
	else
	{
		System.out.println(a[i]+ " positive number");
		p2++;
	}
}
System.out.println("total positive number is " +p2);
System.out.println("total negative number is " +p1);
}
}
