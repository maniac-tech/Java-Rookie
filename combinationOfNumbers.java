import java.io.*;
public class combinationOfNumbers{
	public static void main()throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader (System.in));
		int arr[]={9,6};

		for (int i=0;i<2;i++)
			for (int j=0;j<2;j++)
				System.out.print((arr[i]*10)+arr[j]+" ");
	}
}