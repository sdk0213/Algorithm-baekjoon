package GreedyAlgorithm;

import java.util.Scanner;

public class _1700 {
    static int N;
    static int multi[];
    static int in[][];
    static int repeat=0;

    static boolean compare(int c,int t,int b){
        if(c == N) 
            return true;
        if(in[b][c] != multi[t]) 
            return compare(c+1,t,b);
        return false;
    }
    static void finder(int a,int b){ // 서로다른숫자를 in에다가 넣기
        // System.out.println("a: " + a);
        int count=0;
        for (int i = a; i < multi.length; i++) {
            if(compare(0,i,b) == true){
                in[b][count] = multi[i];
                count++;
            }
            if (count == N){
                // for (int j = 0; j < in.length; j++) {
                //     System.out.print(in[j] + " ");
                // }
                // System.out.println();
                finder(i+1,b+1);
                break;
            }
        }
    }


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int K = sc.nextInt();
        multi = new int[K];
        in = new int[(K/2)+1][N];

        for (int i = 0; i < K; i++) 
            multi[i] = sc.nextInt();

        finder(0,0);

        // for (int i = 0; i < in.length; i++) {
        //     for (int j = 0; j < N; j++) {
        //         System.out.print(in[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        int sum=0;
        for (int i = 0; i < in.length-1; i++) {
            if(in[i+1][0] == 0) break;
            for (int j = 0; j < N; j++) {
                for (int j2 = 0; j2 < N; j2++) {
                    if(in[i][j] == in[i+1][j2]){
                        repeat++;
                    }
                }
            }
            
            int at=0;
            for (int j2 = 0; j2 < N; j2++) {
                if(in[i+1][j2] == 0){
                    at++;
                }        
            }
            // System.out.println("at : " + at);
            
    
            repeat = N - repeat -at;
            // System.out.println(repeat);
            sum+=repeat;
            repeat=0;

        }
        System.out.println(sum);


        // if(repeat - N < 0)
        //     System.out.println("0");
        // else
        //     System.out.println(repeat - N);

        sc.close(); 
        

    }
}