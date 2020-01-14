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
        char dna[][] = new char[N][M];
        int num[] = new int[N];
        String C[];
        for (int j = 0; j < N; j++) {
            C = sc.next().split("");
            
            for (int i = 0; i < M; i++) {
                dna[j][i] = C[i].charAt(0);
                if (C[i].equals("A"))
                    DNA[i][0]++;
                else if (C[i].equals("T"))
                    DNA[i][1]++;
                else if (C[i].equals("G"))
                    DNA[i][2]++;
                else
                    DNA[i][3]++;
                num[j]+=C[i].charAt(0);
            }
        }

        char dap[] = new char[M];
        
        // System.out.println("\n");

        for (int i = 0; i < M; i++) {
            if (DNA[i][0] >= DNA[i][1] && DNA[i][0] >= DNA[i][2] && DNA[i][0] >= DNA[i][3]) {
                dap[i] = 'A';
            }
            else if (DNA[i][1] >= DNA[i][0] && DNA[i][1] >= DNA[i][2] && DNA[i][1] >= DNA[i][3]) {
                dap[i] = 'T';
            }
            else if (DNA[i][2] >= DNA[i][3] && DNA[i][2] >= DNA[i][1] && DNA[i][2] >= DNA[i][0]) {
                dap[i] = 'G';
            }
            else
                dap[i] = 'C';
            
        }

        System.out.println();

        for (int i = 0; i < M; i++) {
            System.out.print(dap[i]);
        }
        System.out.println();

        int sum;
        int min = 9999999;
        int cc=0;

        // System.out.println();
        for (int i = 0; i < N; i++) {
            sum = 0;
            for (int j = 0; j < M; j++) {
                if(dna[i][j] != dap[j]) sum++;
            }
            System.out.println("sum : i : "+ i + "\n sum : "+ sum);
            if(min >= sum){
                if(min==sum){
                    for (int j = 0; j < M; j++) {
                        System.out.println(dna[cc][j] + " ? " +dna[i][j]);
                        if(dna[cc][j] > dna[i][j]){
                            System.out.println("발견 : "+ dna[cc][j] + " > " +dna[i][j]);
                            min = sum;
                            cc = i;
                            break;
                        }
                        else if(dna[cc][j] == dna[i][j])
                            continue;
                        else
                            break;
                        
                    }
                }
                else{
                    min = sum;
                    cc = i;
                }
                
            }
            System.out.println("cc : "+ cc);
            System.out.println();
        }

        int dd = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(dna[cc][j] != dna[i][j]) dd++;
            }
        }

        // System.out.println("답");
        for (int i = 0; i < M; i++) {
            System.out.print(dna[cc][i]);

        }
        
        System.out.println("\n"+dd);


        sc.close();

    }

}