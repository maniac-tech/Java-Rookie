/*
This program will print the following patter

    $
   $$
  $$$
 $$$$
$$$$$


 */
public class pattern3
{
	public static void main(String args[])
	{
		int count =0;
		for (int row=0;row<=5;row++)
		{
			for (int space=0; space<(5-row); space++ ) {
				System.out.print(" ");
			}
			for (int col=0;col<row;col++)
			{
				System.out.print("$");
			}
			System.out.println();
		}
	}
}