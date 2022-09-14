package practice.array;

import java.util.Scanner;

public class Square2 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int[]age=new int[5];
	int square=1;
	for(int i=0;i<age.length;i++)
	{
		System.out.println("enter any number");
		age[i]=s.nextInt();
	}
	for(int i=0;i<age.length;i++)
	{
		square=age[i]*age[i];
		System.out.println("square is"+square);	
	}
	
	
}
}
