package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11727{
    
    static int d[] = new int[1001];
    public static int dp(int x){
        if(x == 1) return 1;
        if(x == 2) return 3; 
        if(d[x] != 0) return d[x];
        return d[x] = ((2*dp(x-2)) + dp(x-1)) % 10007;

    }
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(dp(Integer.parseInt(br.readLine())));

    }

}