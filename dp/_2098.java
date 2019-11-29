package dp;

import java.io.IOException;
import java.util.Scanner;

public class _2098 {
    static int map[][] =new int[16][16];
    static int dp[][] = new int[16][1<<16]; // [16][65536]
    static int n,visited;
    static int INF = Integer.MAX_VALUE - 1000000;

    // visited : 내가 어디에 방문했는지 확인해보는 함수
    static int tsp(int current, int visited){

        if((visited == (1 << n) - 1 )){
            if(map[current][0] == 0){
                return INF;
            }
            return map[current][0];
        }

        if(dp[current][visited] != 0 ){
            return dp[current][visited];
        }
        
        dp[current][visited] = INF;

        for(int k = 0 ; k < n ; k++){
            int next = 1 << k;
            if(map[current][k] == 0 || (visited & next) > 0){
                continue;
            }

            dp[current][visited] = Math.min(dp[current][visited], tsp(k, visited | next) + map[current][k]);

        }

        return dp[current][visited];

    }

    public static void main(String args[]) throws NumberFormatException, IOException {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(sc.next());
            }
        }
        

        System.out.println(tsp(0,1));

        sc.close();
        
    }

}