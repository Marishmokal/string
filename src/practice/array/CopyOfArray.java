package practice.array;

import java.util.Scanner;

public class CopyOfArray {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int[]age=new int[5];
	int[]b=new int[5];
	for(int i=0;i<age.length;i++)
	{
		System.out.println("enter any number");
		age[i]=s.nextInt();
	}
	for(int i=0;i<age.length;i++)
	{
		b[i]=age[i];
		System.out.println(b[i]);
	}
}
}
