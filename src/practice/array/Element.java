package practice.array;

import java.util.Scanner;

public class Element {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	int[]a=new int[5];
	for(int i=0;i<a.length;i++)
	{
		System.out.println("enter any value");
		a[i]=s.nextInt();
	}
	for(int i=0;i<a.length;i++)
	{
	if(a[i]>=0)
System.out.println(a[i]+"it is positive number");
	else
		System.out.println(a[i]+"it is negative number");
}
}
}