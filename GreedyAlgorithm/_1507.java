package GreedyAlgorithm;

import java.util.Scanner;

public class _1507 {

    // X -> Y �� ����
    // {Z1,Z2,Z3} �� ����Ǽ��� ���� ����Ͽ����� ����� �̸��̶�� �� ���� ä���ؾߵ�
    // 1) �׷��Ƿ� Z1,Z2,Z3 �� ���� �����ϴ� ����� ���� ����ؾ���
    // ������Ǽ��� ������� ���Ҽ� ������?

    static void check(){


    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int street[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                street[i][j] = sc.nextInt();
            }   
        }


        
        sc.close();

        

    }
    
}