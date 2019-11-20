package GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*

뒤집거나 안뒤집거나 둘중하나
각 행열마다 [0],[0] ~ [N-2], [M-2] 까지
 
최댓값 : (N-2) * (M-2)의 
최솟값 : ?
잘못 : -1 출력

0번부터 N-2까지 전부다 변경을 하면서
만약에 변경횟수만 저장
전부다 변경후 값을 비교하여서 틀리다면 -1
같다면 변경됫 횟수 출력

*/

public class _1080 {
    static int N, M;
    static String A[][], B[][], imsi[];

    public static void reverse33(int a, int b) throws NumberFormatException {
        for (int i = a; i < a + 3; i++) {
            for (int j = b; j < b + 3; j++) {
                A[i][j] = (Integer.parseInt(A[i][j]) ^ 1) + "";
            }
        }

        
    }
    
    // public static void reverse() throws NumberFormatException{
    //     for (int i = 0; i < N; i++) {
    //         for (int j = 0; j < M; j++) {
    //             A[i][j] = (Integer.parseInt(A[i][j]) ^ 1) + "";
    //         }
    //     }
    // }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        imsi = br.readLine().split(" ");
        N = Integer.parseInt(imsi[0]);
        M = Integer.parseInt(imsi[1]);
        A = new String[N][M];
        B = new String[N][M];

        for (int i = 0; i < N; i++) {
            imsi = br.readLine().split("");
            for (int j = 0; j < imsi.length; j++) {
                A[i][j] = imsi[j];
            }

        }

        for (int i = 0; i < N; i++) {
            imsi = br.readLine().split("");
            for (int j = 0; j < imsi.length; j++) {
                B[i][j] = imsi[j];
            }

        }
        int count=0;


        if (N >= 3 && M >= 3) {
            count = 0;
            for (int i = 0; i < N - 2; i++) {
                for (int j = 0; j < M - 2; j++) {
                    if (!(A[i][j].equals(B[i][j]))) {
                        // System.out.println("i : " + i+" j : " +j+"변경");
                        count++;
                        reverse33(i, j);
                        
                    }
                }
            }
        }
        else{
            if(!(A[0][0].equals(B[0][0])))
                count++;
        }

        
        
        // System.out.println();        
        // System.out.println();

        // for (int i = 0; i < N; i++) {
        //     for (int j = 0; j < M; j++) {
        //         System.out.print(A[i][j]);
        //     }
        //     System.out.println();
        // }
        // System.out.println();
        // for (int i = 0; i < N; i++) {
        //     for (int j = 0; j < M; j++) {
        //         System.out.print(B[i][j]);
        //     }
        //     System.out.println();
        // }

        int check=0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(A[i][j].equals(B[i][j]))
                    check++;
            }
        }
        if(check == N*M)
            System.out.println(count);
        else
            System.out.println("-1");

    }

}