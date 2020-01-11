package GreedyAlgorithm;

import java.util.Scanner;

public class _1969 {

    static int DNA[][];
    static int N, M;

    // 결과적으로 나온데이터가 실제 존재하는 데이터가 아닐경우 존재함
    // 그것을 다시 확인하기 위해서 다시 비교를 하기에는 너무 많은 데이터를 검사해야하는것같은
    // 다른방법이 필요한듯 보임

    
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