package GreedyAlgorithm;

import java.util.Scanner;

public class _1507 {

    static int d[][];
    static int N;
    static boolean visited[];

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        d = new int[N][N];
        int a[][] = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                d[i][j] = sc.nextInt();
                a[i][j] = d[i][j];

            }
        }


        for(int k = 0 ; k < N ; k++){ // ��ġ�°��
            for(int i = 0 ; i < N; i++){ // ��߰��
                for(int j = 0 ; j < N ; j++){ // �������

                    if( i == k || j == k) continue; // ���,������ ��ġ�°�ζ� ���� ���� ����ϸ� �ȵ�
                     								// �׷��� ������� ���δ� 0 ���� ��µǴ� ��찡 �߻���

                    if(d[i][j] > d[i][k] + d[k][j]) { // �������°� �� ū���� �����Ȱ��� ���� �������� �ƴѰ�찡 �����ϴ°����
                    									// �׷��ϱ� �̹� ����Ǿ��ٴ� ��
                        System.out.println(-1);
                        sc.close();
                        return;
                    }

                    if(d[i][k] + d[k][j] == d[i][j]) // ���İ��°��� �����Ͱ� ���ٸ� a[i][j]�� 0 ���� �����ؼ� �ش���� ����ϱ�
                        a[i][j] = 0;
                }
            }
        }

        int sum = 0;
        for(int i = 0 ; i < N ; i++){
            for(int j = i ; j < N ; j++){
                sum += a[i][j];
            }
        }


        System.out.println(sum);


        sc.close();
        

        
        

    }
    
}