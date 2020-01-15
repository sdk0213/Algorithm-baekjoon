package GreedyAlgorithm;

import java.util.Scanner;

public class _1969 {

    static int DNA[][];
    static int N, M;
    static char dna[][];
    static String C;    
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        DNA = new int[M][4];
        dna = new char[N][M];
        
        for (int j = 0; j < N; j++) {
            C = sc.next();
            for (int i = 0; i < M; i++){
                dna[j][i] = C.charAt(i);
                if (C.charAt(i)=='A')
                    DNA[i][0]++;
                else if (C.charAt(i)=='C')
                    DNA[i][1]++;
                else if (C.charAt(i)=='G')
                    DNA[i][2]++;
                else
                    DNA[i][3]++;
            }
        }

        char dap[] = new char[M];

        for (int i = 0; i < M; i++) {
            if (DNA[i][0] >= DNA[i][1] && DNA[i][0] >= DNA[i][2] && DNA[i][0] >= DNA[i][3]) 
                dap[i] = 'A';            
            else if (DNA[i][1] >= DNA[i][0] && DNA[i][1] >= DNA[i][2] && DNA[i][1] >= DNA[i][3])
                dap[i] = 'C';
            else if (DNA[i][2] >= DNA[i][3] && DNA[i][2] >= DNA[i][1] && DNA[i][2] >= DNA[i][0])
                dap[i] = 'G';
            else
                dap[i] = 'T';
        }

       for (int i = 0; i < M; i++) {
           System.out.print(dap[i]);
       }
       int n=0;
       for (int i = 0; i < N ; i++) {
           for (int j = 0; j < M ; j++) {
               if(dna[i][j] != dap[j]) n++;
           }
       }
       System.out.println("\n"+n);


        sc.close();

    }
}