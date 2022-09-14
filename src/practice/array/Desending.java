package practice.array;

import java.util.Scanner;

public class Desending {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int []a=new int [5];
		int min=0;
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter Value");
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<a.length;i++)
		{
		 if(a[0]==0)
		 {
			 min=a[0];
		 }
		 
		}
	}
}
