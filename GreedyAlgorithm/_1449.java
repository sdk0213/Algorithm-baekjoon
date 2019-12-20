package GreedyAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class _1449 {
    static int leak[];
    static int ck;
    static int base;
    static void check_leak(int L){
        ck = L-1;
        base = leak[0] + ck;
        int min=0;
        for (int i = 0; i < leak.length; i++) {
                if(leak[i] > base){
                    base = leak[i] + ck;
                    min++;
                }
        }
        System.out.println(min+1);

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();

        leak = new int[N];

        for (int i = 0; i < N; i++) 
            leak[i] = sc.nextInt();
        
            
        Arrays.sort(leak);

        // for (int i = 0; i < leak.length; i++) {
        //     System.out.print(leak[i]+ " ");
        // }

        check_leak(L);

        sc.close();

    }
}