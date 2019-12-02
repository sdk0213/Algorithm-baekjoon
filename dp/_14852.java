package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _14852{
    static int n;
    static long d[][] = new long[1000000][2];
    static long dp(int c){
        d[0][0] = 0;
        d[1][0] = 2;
        d[2][0] = 7;
        d[2][1] = 1;
        for(int i = 3 ; i <= c ; i++){
            d[i][1] = (d[i-1][1] + d[i - 3][0]) % 1000000007;
            d[i][0] = (2*d[i-1][0] + 3*d[i-2][0] + 2*d[i][1]) % 1000000007;
            
        }

        return d[c][0];
        
    }
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        System.out.println(dp(n));

    }
}