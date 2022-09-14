package practice.array;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int max=0;
		int min=0;
		int []a=new int [5];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter values");
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<a.length;i++)
		{
			if(i==0) 
			{
			max=a[0];
			min=a[0];
			}
			if(a[i]>max)
				max=a[i];
			else if(a[i]<min)
				min=a[i];
		}
		System.out.println("max number is:= "+max);
		System.out.println("min number is:= "+min);
	}

}
