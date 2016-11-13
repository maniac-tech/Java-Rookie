/*
This program is written to check whether a given numbre is Armstrong or not.
Currently the program will only check is the number "375" is an Armstrong number or not.
And the answer is supposed to be No.

Replace the value 375 with some other numbre and see it in action!
 */public class Armstrong 
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