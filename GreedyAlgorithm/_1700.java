package GreedyAlgorithm;

import java.util.Scanner;

public class _1700 {
    static int N,K;
    static int multi[];
    static int in[];

    static boolean compare(int i){ 
        for (int j = 0; j < N; j++) 
            if(in[i] == multi[j]) return true;
        return false;
    }

    static boolean use(int a,int i){
        for (int j = 1; j <= N; j++) {
            if(multi[a] == in[i+j]) return true;
        }
        
        return false;
    }


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        multi = new int[N]; // ¸ÖÆ¼ÅÇ
        in = new int[K];
        int result=0;

        for (int i = 0; i < K; i++) 
            in[i] = sc.nextInt();

        for (int i = 0; i < K; i++) {
            if(compare(i)==false){
                for (int j = 0; j < N; j++) 
                    if(use(j,i)==false){
                        
                        result++;    
                    }
            }

        }

        
        sc.close();

        

    }
}