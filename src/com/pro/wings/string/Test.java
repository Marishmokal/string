package com.pro.wings.string;

public class Test implements Cloneable{
static int count=0;
{
	count++;
}
Test()
{
	
}
Test(int i)
{
	
}
Test(double d)
{
	
}
public static void main(String args[]) throws CloneNotSupportedException
{
	Test s1=new Test();
	Test s9=(Test)s1.clone();
	Test s2=new Test(10);
	Test s3=new Test(5.5);
	System.out.println("number of object created:-"+count);
	System.out.println();
	
	System.out.println(s1.hashCode());
	System.out.println(s9.hashCode());
}
}
