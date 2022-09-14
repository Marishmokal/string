package practice.array;

import java.util.Scanner;

public class CountValues {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = 0;
		int n = 0;
		int p = 0;
		int age[] = new int[5];
		for (int i = 0; i < age.length; i++) {
			System.out.println("enter any number");
			age[i] = s.nextInt();
		}
		for (int i = 0; i < age.length; i++) {
			if (age[i] > 0) {
				a++;

			} else if (age[i] < 0) {
				n++;

			} else {
				p++;
			}

		}
		System.out.println("positive number" + a++);
		System.out.println("negative number" + n++);
		System.out.println("zero"+p++);
	}
}