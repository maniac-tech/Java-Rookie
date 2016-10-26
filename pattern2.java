/*
This program will print the following patter

1
12
123
1234
12345
*/

public class pattern2
{
	public static void main(String args[])
	{
		int count =0;
		for (int row=0;row<=5;row++)
		{
			for (int col=1;col<=row;col++)
			{
				System.out.print(col);
			}
			System.out.println();
		}
	}
}