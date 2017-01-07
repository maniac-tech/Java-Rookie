/*
	This program will check if the provided Strings are paindrome or not.
	Example: Mam when printed in reverse is "Mam" - Thus Palindrome
			 Work when printed in reverse is "korw" - Thus not palindrome
 */
import java.io.*;
public class palindromeString{
	public static void main(String [] args)throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader (System.in));
		String str = obj.readLine();
		int len=str.length();
		String str2="";
		for (int i=len-1;i>=0;i--){
			str2+=str.charAt(i);
		}

		if (str.equals(str2))
			System.out.println("Yes");
        else
            System.out.println("No");
	}
}