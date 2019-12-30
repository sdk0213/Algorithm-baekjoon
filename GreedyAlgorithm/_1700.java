package GreedyAlgorithm;

import java.util.Scanner;

public class _1700 {
    static int N, K;
    static int multi[];
    static int in[];
    static boolean m[];
    static int result = 0;

    static boolean compare(int i) { // ��Ƽ�Ǿȿ� ������ �̹� �ִ°�
        for (int j = 0; j < N; j++)
            if (in[i] == multi[j])
                return true;
        return false;
    }

    static int empty(int j) {
        for (int i = 0; i < N; i++) {
            if (m[i] == false) { // ����ִٸ�
                return i;
            }
        }
        return -1; // ����ִ°��� ���ٸ�
    }

    static int future(int i) {
        int count = 0;
        int max = 0;
        int multi_max = 0;
        for (int j = 0; j < N; j++) {
            for (int j2 = i + 1; j2 < K; j2++) {
                if (multi[j] == in[j2])
                    break;

                count++;
            }
            if (max < count) {
                max = count;
                multi_max = j;
            }
            // System.out.println("multi["+j+"] = "+multi_max + " count = "+ count);

            count = 0;
        }
        return multi_max;

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        multi = new int[N]; // ��Ƽ��
        m = new boolean[N];
        in = new int[K];

        for (int i = 0; i < K; i++)
            in[i] = sc.nextInt();
        for (int i = 0; i < N; i++)
            m[i] = false;

        // �������� �ִ°�
        // ����ִ°�
        // �Ѵ� �ƴ϶�� �Ŀ� ���� �ڿ� �����°��� ���� �̱�

        for (int i = 0; i < K; i++) {
            if (compare(i) == true) { // �������� �ִٸ�
                continue;
            } else { // �������� ���ٸ�
                int e;
                if ((e = empty(i)) != -1) { // ������ִٸ�
                    multi[e] = in[i];
                    m[e] = true;
                } else { // ��������ٸ�
                    multi[future(i)] = in[i]; // ���� �ڿ� �����°��� ���� �̱�
                    result++;

                }
            }
            // for (int j = 0; j < multi.length; j++) {
            // System.out.print(multi[j] + " ");
            // }
            // System.out.println();
        }

        System.out.println(result);

    }
}