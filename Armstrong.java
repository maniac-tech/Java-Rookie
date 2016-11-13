public class Armstrong 
{
	public static void main (String args[])
	{
		int number=375;
		int number_copy=number;
		
		int num=0;
		int armstrong=0;
		/*System.out.println(number_copy/10);
		System.out.println(number_copy%10);*/
		while (number_copy>0)
		{
			num=number_copy%10;
			number_copy/=10;
			num = num*num*num;
			armstrong+=num;
		}
		System.out.println(armstrong);
		if (armstrong==number)
			System.out.println("Armstrong!");
		else	
			System.out.println("Not Armstrong!");
	}
}