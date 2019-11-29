package dp;

import java.io.IOException;
import java.util.Scanner;



public class _2133{
    static int result = 0;
    static int d[] = new int[100];
    public static int dp(int n){
        
        if(n==0)
            return 1;
        if(n==1)
            return 0;
        if(n==2)
            return 3;
        if(d[n] != 0)
            return d[n];
        result = 3*dp(n-2);

        for(int i = 4 ; i <= n ; i+=2){
            result += 2*dp(n-i);
        }        
        return d[n] = result;       
    
    }

    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(dp(n));
        
        sc.close();

    }
}