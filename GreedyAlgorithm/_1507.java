package GreedyAlgorithm;

import java.util.Scanner;

public class _1507 {

    static int d[][];
    static int N;
    static boolean visited[];

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        d = new int[N][N];
        int a[][] = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                d[i][j] = sc.nextInt();
                a[i][j] = d[i][j];

            }
        }


        for(int k = 0 ; k < N ; k++){ // 거치는경로
            for(int i = 0 ; i < N; i++){ // 출발경로
                for(int j = 0 ; j < N ; j++){ // 도착경로

                    if( i == k || j == k) continue; // 출발,도착이 거치는경로랑 같은 경우는 계산하면 안됨
                     								// 그러지 않은경우 전부다 0 으로 출력되는 경우가 발생함

                    if(d[i][j] > d[i][k] + d[k][j]) { // 직접가는게 더 큰경우는 제공된것이 가장 빠른길이 아닌경우가 존재하는경우임
                    									// 그러니까 이미 모순되었다는 뜻
                        System.out.println(-1);
                        sc.close();
                        return;
                    }

                    if(d[i][k] + d[k][j] == d[i][j]) // 거쳐가는것이 기존것과 같다면 a[i][j]에 0 으로 저장해서 해당길은 폐쇄하기
                        a[i][j] = 0;
                }
            }
        }

        int sum = 0;
        for(int i = 0 ; i < N ; i++){
            for(int j = i ; j < N ; j++){
                sum += a[i][j];
            }
        }


        System.out.println(sum);


        sc.close();
        

        
        

    }
    
}