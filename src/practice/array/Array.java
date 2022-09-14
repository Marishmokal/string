package practice.array;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int []a=new int[5];
		

for(int i=0;i<a.length;i++)
{
	System.out.println("enter any num");
	a[i]=sc.nextInt();
}
System.out.println("values are");
for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]);
}
	}
}
