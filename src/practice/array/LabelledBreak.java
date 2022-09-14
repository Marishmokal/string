package practice.array;

public class LabelledBreak {
public static void main(String[] args)
{
	int i=0;
	int j=1;
	l1:
	for( i=0;i<3;i++)
	{
		for( j=1;j<3;j++)
		{
			if(i==j)
				break l1;
			System.out.println(i+ "...."+j);
		}

	}
	System.out.println("by by");
}
}
