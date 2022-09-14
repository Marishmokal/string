package practice.array;

import java.util.Scanner;

public class Reverse2 {
public static void main(String[] args) {
	int[]age=new int[5];
	Scanner s=new Scanner(System.in);
	for(int i=0;i<age.length;i++)
	{
		System.out.println("enter any number");
		age[i]=s.nextInt();
	}
	for(int i=age.length-1;i>=0;i--)
	{
		System.out.println(age[i]);
	}
}
}
