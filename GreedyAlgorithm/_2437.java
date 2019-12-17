package GreedyAlgorithm;

import java.util.Scanner;

public class _2437 {
    static int weight[];
    static int d[];
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        weight = new int[N];
        for (int i = 0; i < N; i++) {
            weight[i] = sc.nextInt();
        }

        d = new int[1 << N];
        int count=1;
        d[0] = 0;
        for (int i = 0; i < weight.length ; i++) {
            for (int j = 0; j < 1 << i ; j++) {
                d[count] = d[j] + weight[i];
                count++;
            }
        }

        for (int i = 0; i < d.length; i++) {
            
        }



        
        sc.close();

    }
}