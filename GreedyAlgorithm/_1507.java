package GreedyAlgorithm;

import java.util.Scanner;

public class _1507 {

    // X -> Y 로 갈때
    // {Z1,Z2,Z3} 의 경우의수를 전부 고려하였을때 비용이 미만이라면 그 길을 채택해야됨
    // 1) 그러므로 Z1,Z2,Z3 을 전부 나열하는 방법의 수를 고려해야함
    // 모든경우의수는 어떤식으로 구할수 있을까?

    static void check(){


    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int street[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                street[i][j] = sc.nextInt();
            }   
        }


        
        sc.close();

        

    }
    
}