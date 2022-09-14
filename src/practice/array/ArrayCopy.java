package practice.array;

import java.util.Scanner;

public class ArrayCopy {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int[]a=new int[5];
	int b[]=new int[5];
for(int i=0;i<a.length;i++)
{
	System.out.println("enter value");
	a[i]=s.nextInt();
	b[i]=a[i];
	
}
System.out.println("after copy");
for(int i=0;i<b.length;i++)
{
System.out.println("another array"+b[i]);

}
}
}