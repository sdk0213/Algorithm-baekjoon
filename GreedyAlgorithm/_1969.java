package GreedyAlgorithm;

import java.util.Scanner;

public class _1969 {

    static int DNA[][];
    static int N, M;

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        DNA = new int[M][4];
        String C[];
        for (int j = 0; j < N; j++) {
            C = sc.next().split("");
            for (int i = 0; i < M; i++) {
                if (C[i].equals("A"))
                    DNA[i][0]++;

                else if (C[i].equals("T"))
                    DNA[i][1]++;

                else if (C[i].equals("G"))
                    DNA[i][2]++;

                else
                    DNA[i][3]++;

            }

        }

        System.out.println("½ÃÀÛ");

        int cnt = 0;

        for (int i = 0; i < M; i++) {
            if (DNA[i][0] >= DNA[i][1] && DNA[i][0] >= DNA[i][2] && DNA[i][0] >= DNA[i][3]) {
                System.out.print("A");
            }
            else if (DNA[i][1] >= DNA[i][0] && DNA[i][1] >= DNA[i][2] && DNA[i][1] >= DNA[i][3]) {
                System.out.print("T");
            }
            else if (DNA[i][2] >= DNA[i][3] && DNA[i][2] >= DNA[i][1] && DNA[i][2] >= DNA[i][0]) {
                System.out.print("G");
            }
            else
                System.out.print("C");
            

        }

        sc.close();

    }

}