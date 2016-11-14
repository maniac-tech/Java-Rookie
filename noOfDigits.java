/*
This program will count the number of digits in a number.
 */
public class noOfDigits
{
	public static void main (String args[])
	{
		int number=445656;
		int numberCopy=number;
		int count=0;
		int num=0;

		while (numberCopy>0)
		{
			num=numberCopy%10;
			numberCopy/=10;
			count++;
		}
		System.out.println("Number of digits: "+count);
	}
}