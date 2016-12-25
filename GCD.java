import java.io.*;
public class GCD{
	public static void main()throws IOException{
		BufferedReader obj = new BufferedReader (new InputStreamReader (System.in));

		System.out.println("Enter two no's:");
		int n1=Integer.parseInt(obj.readLine());
		int n2=Integer.parseInt(obj.readLine());

		int ans=0;
		if (n1>n2){
			for(int i=1;i<n2;i++){
				if (n2%i==0 && n1%i==0)
					ans=i;
			}
		}
		else{
			for (int i=1;i<n1;i++){
				if (n2%i==0 && n1%i==0)
					ans=i;
			}
		}
		System.out.println("GCD is: "+ans);
	}
}