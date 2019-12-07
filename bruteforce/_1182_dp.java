package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _1182_dp {

    static StringBuilder sb = new StringBuilder();
    static int d[];
    static int n[] = new int[21];
    static int dap=0;
    public static void main(String args[]) throws IOException, NumberFormatException{
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int hap = sc.nextInt();
        for (int i = 0; i < num; i++) {         
            n[i] = sc.nextInt();
        }
        d = new int[1 << num];

        int count=1;
        d[0] = 0;
        for(int i = 0 ; i < num ; i++){
               for(int j = 0 ; j < 1 << i ; j++){
                    d[count] = d[j]+n[i];
                    if(d[count] == hap) dap++; 
                    count++;
               }
        }

        System.out.println(dap);


    }
}