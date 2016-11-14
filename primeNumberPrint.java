/*
This program will print the prime numbers from 1 to 100
 */
public class primeNumber
{
	public static void main (String args[])
	{	
		int strt_num=1;
		int end_num=100;
		for (int i=strt_num; i<end_num; i++) {
			int count=0;
			for (int j=1;j<=i ;j++ ) {
				if ( j==1)
					count++;
				else{
					if (i%j==0)
					{
						count++;
						break;
					}
					else
						count++;	
				}	
			}
			if (count==i)
				System.out.println(i+" is a Prime Number!");
		}
	}
}