/*
This program will print the following patter

$
$$
$$$
$$$$
$$$$$

*/

public class pattern1
{
	public static void main(String args[])
	{
		int count =0;
		for (int row=0;row<=5;row++)
		{
			for (int col=0;col<row;col++)
			{
				System.out.print("$");
			}
			System.out.println();
		}
	}
}