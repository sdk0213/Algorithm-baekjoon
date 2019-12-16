package GreedyAlgorithm;

import java.util.Scanner;

public class _1783 {

    static int night_max(int n,int m){
        
        if(n==1) return 1;
        if(n==2){
            if(m == 1 || m == 2) return 1;
            if(m == 3 || m == 4) return 2;
            if(m == 5 || m == 6) return 3;
            if(m >= 7) return 4;
        }
        if(n>=3){
            if(m==1) return 1;
            if(m==2) return 2;
            if(m==3) return 3;
            if(m>=4 && m<=6) return 4;
            if(m>=7) return (m-7) + 5;
        }
        return 0;

    }
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        System.out.println(night_max(N, M));


        sc.close();

    }

}