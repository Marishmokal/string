package practice.array;

import java.util.Scanner;

public class Square {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int[]a=new int[5];
	int square;
	for(int i=0;i<a.length;i++)
	{
		System.out.println("enter any value");
		a[i]=s.nextInt();
	}
	for(int i=0;i<a.length;i++)
	{
		square=a[i]*a[i];
		System.out.println("square is"+square);
	}
}
}
