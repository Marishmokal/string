package practice.array;

import java.util.Scanner;

public class Break2 {
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("enter numbers");
	int num;
	for(int i=1;i<=10;i++)
	{
		num=s.nextInt();
		if(num>=500&&num<=600)
			break;
		System.out.println(num);
	}
}
}
