/*
	This program will check if the entered numbre is a Palindrome or not.
 */
public class palindrome
{
	public static void main (String args[])
	{
		int number = 7876;
		int numberCopy=number;
		int countOfDigits=0;
		int num=0;
		int result=0;
		countOfDigits=noOfDigits(number);

		for (int i=1;i<=countOfDigits ;i++ ) {
			num=numberCopy%10;
			result+=num;
			result*=10;
			numberCopy/=10;
		}
		result/=10;
		if (result==number)
			System.out.println("Palindrome!");
		else
			System.out.println("Not Palindrome");

	}

	static int noOfDigits(int value)
	{
		int number=value;
		int numberCopy=number;
		int count=0;
		int num=0;

		while (numberCopy>0)
		{
			num=numberCopy%10;
			numberCopy/=10;
			count++;
		}
		return count;
	}
}