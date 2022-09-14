package practice.array;

public class Array1
{
	public static void main(String[] args)
	{
		int[] nums = new int[5];
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		nums[3]=4;
		nums[4]=5;
		
		System.out.println("printing even numbers");
		//printEvenNumberForArray(nums);
		PrintOddNumberForArray(nums);
	}

		
	

	public static void PrintOddNumberForArray(int[] nums) {
		// TODO Auto-generated method stub
		for(int i=0;i<=nums.length;i++)
		{
			if(nums[i] % 2 != 0)
			{
				System.out.println(nums[i]);
			}
		}
		
	}

/*public static void printEvenNumberForArray(int[] nums)
	{
		// TODO Auto-generated method stub
		for (int i = 0; i < nums.length; i++)
		{
			if (nums[i] % 2 == 0) 
			{
				System.out.println(nums[i]);
			}
		}
	}*/

}
