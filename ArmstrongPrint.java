/*
This program will print all Armstrong number in between 1 and 1000.
 */
public class ArmstrongPrint
{
	public static void main (String args[])
	{
		int start=0;
		int end=1000;

		for (int i=start; i<end; i++)
		{
			int number=i;
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
			if (armstrong==number)
				System.out.println(number);
		}
	}
}