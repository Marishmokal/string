package practice.array;

public class AcceptValue 
{
public static void main(String[] args) 
{
	int []age= {8,12,10,2,15};
	int num=0;
	System.out.println("enter any number"+num);
	for(int i=0;i<age.length;i++)
	{
		if(age[i]==num)
		{
			System.out.println("present in array");
		}
		else
			System.out.println("not present");
	}
}
}
