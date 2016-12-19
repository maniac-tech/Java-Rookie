import java.io.*;
public class arrayAscendingOrder{
	public static void main()throws IOException{
		BufferedReader obj = new BufferedReader (new InputStreamReader (System.in));
		System.out.println("This program will ask you for input and will print the array in Ascending order.");
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

		for (int i=0;i<n;i++)
			for (int j=i+1;j<n;j++)
				if (arr[i]>arr[j]){
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}

		System.out.println("The array in Ascending Order is:");
		for (int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}
}