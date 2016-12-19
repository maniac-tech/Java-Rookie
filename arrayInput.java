import java.io.*;
public class arrayInput{
	public static void main()throws IOException{
		BufferedReader obj = new BufferedReader (new InputStreamReader (System.in));
		System.out.println("This program will ask you for input and will print the array entered by you in serial order and in reverse order.");
		System.out.println("Enter the size of your array:");
		int n = Integer.parseInt(obj.readLine());

		int arr [] = new int [n];

		System.out.println("Enter "+n+" elements in the array (ONLY INTEGERS):");
		for (int i=0;i<n;i++)
			arr[i]=Integer.parseInt(obj.readLine());
		System.out.println("");

		System.out.println("The elements entered by you are:");
		for (int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		System.out.println("");

		System.out.println("Now, we are printing the array entered by you in reverse order: ");
		for (int i=n-1;i>=0;i--)
			System.out.print(arr[i]+" ");
		System.out.println("");

	}
}