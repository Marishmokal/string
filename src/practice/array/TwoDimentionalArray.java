package practice.array;

public class TwoDimentionalArray
{
public static void main(String[] args) 
{
	int[][]age= {{10,20,30},{40,50}};
	for(int i=0;i<age.length;i++)
	{
		for(int j=0;j<age[i].length;j++)
		{
	System.out.println(age[i][j]);
		}
	}
	for(int x1[]:age)
	{
		for(int x2:x1)
		{
			System.out.println(x2);
		}
	}
	}
}
