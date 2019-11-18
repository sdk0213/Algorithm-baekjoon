package GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
하나하나 검사하여서 01001001 추적 dfs를 생성할 예정임
이거말고 방법이 없다고 판단이됨ㄴ

*/

public class _1080{
    static int N,M;
    static String A[][],B[][],imsi[];
    public static void dfs(int N,int M){


    }

    public static boolean isPossible(){

        return true;
    }
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        imsi = br.readLine().split(" ");
        N = Integer.parseInt(imsi[0]);
        M = Integer.parseInt(imsi[1]);
        A = new String[N][M];
        B = new String[N][M];

        for (int i = 0; i < N; i++) {
            imsi = br.readLine().split("");
            for (int j = 0; j < imsi.length; j++) {
                A[i][j] = imsi[j];
            }
            
        }

        for (int i = 0; i < N; i++) {
            imsi = br.readLine().split("");
            for (int j = 0; j < imsi.length; j++) {
                B[i][j] = imsi[j];
            }
            
        }


        dfs(0,0);


    }

}