package GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// �ð��ʰ�����
// 1. �迭���� ����Ʈ�� ����ؾߵȴ�.
// �ݺ����� ����ϴ°��� ��������
// 1. �����������Ĥ�

public class _1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // �׽�Ʈ���̽� ����
        int N;
        int[][] rank = null;
        StringTokenizer st = null;
        int result[] = new int[T];
        for (int i = 0; i < T; i++) { // �׽�Ʈ���̽��� ������ŭ �ݺ���
            N = Integer.parseInt(br.readLine()); // ����� �Ի������ڰ� �ִ���
            rank = new int[N][2];
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                rank[j][0] = Integer.parseInt(st.nextToken());
                rank[j][1] = Integer.parseInt(st.nextToken());

            }

            Arrays.sort(rank, new Comparator<int[]>() { // ù°���� �������� ������������ �����Ѵ�
                @Override
                public int compare(int[] o1, int[] o2) {
                    // TODO Auto-generated method stub
                    return o1[0] - o2[0];
                }
            });

            // for (int j = 0; j < rank.length; j++) {
            //     for (int j2 = 0; j2 < 2; j2++) {
            //         System.out.print(rank[j][j2] + " ");
            //     }
            //     System.out.println();
            // }

            // ���������� ���࿡ 2��° ���� �������鼭 �ڱ��ڽź��� �������ڰ� �ִٸ� X
            // ���� : ��ü ������ - X
            // �迭�� [2] ����� [0] [1] ������ ��밡��

            int X = 0;
            for (int j = 0; j < rank.length; j++) {
                // System.out.println(" j : " + j + " rank.length : " + rank.length);
                for (int c = rank.length - 1 - j; c > 0; c--) { // �ڱ� �ڽź��� �������ڳ����� X
                    // System.out.println(rank[rank.length - 1 - j][1] + " // " + rank[c - 1][1]);
                    if (rank[rank.length - 1 - j][1] > rank[c - 1][1]) { // �ڱ��ڽź��� �Ʒ����� �׷��ϱ� 5���� 4,3 4,2 4,1 4,0
                        X++;
                        break;
                    }
                }
            }
            // System.out.println(" X : " + X + " rank.lenght : "+ rank.length);

            // �ڱ� ���� �����͵��� �ݺ�
            
            result[i] = rank.length - X;

        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
}