import java.io.*;
public class factorialUsingRecursion{
	public static void main(String args[])throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader (System.in));
		int n;
		System.out.println("Enter the number:");
		n = Integer.parseInt(obj.readLine());

		int fact = facto(n);
		System.out.println("Factorial is: "+fact);
	}

	public static int facto (int n){
		if (n==1)
			return 1;
		else
			return (n*facto(n-1));
	}
}