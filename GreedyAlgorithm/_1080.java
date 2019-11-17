package GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

/*


00001 10111
00001 10111
00001 10111
00000 00000

처음을 바꾸고
두번째꺼 바꾸고
세번째꺼 바꾸고
                 
     0     1
    1      
   1
  0
 1


★ 홀수번을 뒤집으면 숫자가 바뀌고 짝수번을 뒤집으면 숫자가 안바뀐다. ★
2

OO
OO

OXX
OXX

XXO
XXO


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

        for(String a[] : A){
            for(String e : a){
                    System.out.print(e);
            }
            System.out.println();
        }

        dfs(0,0);


    }

}