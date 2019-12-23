package GreedyAlgorithm;

import java.util.Scanner;

public class _1700 {
    static int N;
    static int multi[];
    static int in[];
    static int repeat=0;

    static boolean compare(int c,int t){
        if(c == N) 
            return true;
        if(in[c] != multi[t]) 
            return compare(c+1,t);
        return false;
    }
    static void finder(int a){ // 서로다른숫자를 in에다가 넣기
        // System.out.println("a: " + a);
        int count=0;
        for (int i = a; i < multi.length; i++) {
            if(compare(0,i) == true){
                in[count] = multi[i];
                repeat++;
                count++;
            }
            if (count == N){
                // for (int j = 0; j < in.length; j++) {
                //     System.out.print(in[j] + " ");
                // }
                finder(i+1);
                break;
            }
        }
    }


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int K = sc.nextInt();
        multi = new int[K];
        in = new int[N];

        for (int i = 0; i < K; i++) 
            multi[i] = sc.nextInt();

        finder(0);

        if(repeat - N < 0)
            System.out.println("0");
        else
            System.out.println(repeat - N);

        sc.close(); 
        

    }
}