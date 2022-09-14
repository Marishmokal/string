package com.pro.wings.string;

public class DemoString {
public static void main(String[] args) {
	
	String s1="Hello";
	//StringBuffer s2=new StringBuffer("Hello");
	StringBuffer s3=new StringBuffer("Hello");
	
//	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s3));
 
 //System.out.println(s4==s3);
 //System.out.println(s2==s3);
 System.out.println(s1.hashCode());
 System.out.println(s3.hashCode());
 
}
}
