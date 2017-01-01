/*
We define a hackonacci series as follows:
hackonacci (n) = 1*hackonacci(n-1) + 2*hackonacci(n-2) + 3*hackonacci(n-3)

-->     hackonacci (1) = 1
-->     hackonacci (2) = 2
-->     hackonacci (3) = 3
 */
import java.io.*;
public class hackonacciSeries{
    public static void main ()throws IOException{
        BufferedReader obj = new BufferedReader (new InputStreamReader (System.in));
        int n;

        System.out.println("Enter n:");
        n = Integer.parseInt(obj.readLine());

        System.out.println(calculate(n));
    }
    public static int calculate(int n){
        int ans=0;
        if (n==1){
            n--;
            return 1;
        }
        else if (n==2){
            n--;
            return 2;
        }
        else if (n==3){
            n--;
            return 3;
        }
        else
            return ((1*calculate(n-1))+(2*calculate(n-2))+(3*(calculate(n-3))));
    }
}