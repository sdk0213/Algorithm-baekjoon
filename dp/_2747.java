package dp;

import java.util.Arrays;
import java.util.Scanner;

public class _2747{

    static int pibo_mem[] = new int[100];
    public static int pibo(int n){

        if( pibo_mem[n] != -1) 
          return pibo_mem[n];
          
        if( n < 2 )
          pibo_mem[n] = n;
        else
          pibo_mem[n] = pibo(n-1) + pibo(n-2);

        return pibo_mem[n];

    }
    public static void main(String args[]){
        Arrays.fill(pibo_mem, -1);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(pibo(a));

    }
}