package GreedyAlgorithm;

import java.util.Scanner;

public class _1700 {
    static int N, K;
    static int multi[];
    static int in[];
    static boolean m[];
    static int result = 0;

    static boolean compare(int i) { // 멀티탭안에 들어갈수가 이미 있는가
        for (int j = 0; j < N; j++)
            if (in[i] == multi[j])
                return true;
        return false;
    }

    static int empty(int j) {
        for (int i = 0; i < N; i++) {
            if (m[i] == false) { // 비어있다면
                return i;
            }
        }
        return -1; // 비어있는곳이 없다면
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
        multi = new int[N]; // 멀티탭
        m = new boolean[N];
        in = new int[K];

        for (int i = 0; i < K; i++)
            in[i] = sc.nextInt();
        for (int i = 0; i < N; i++)
            m[i] = false;

        // 같은수가 있는가
        // 비어있는가
        // 둘다 아니라면 후에 가장 뒤에 나오는것을 먼저 뽑기

        for (int i = 0; i < K; i++) {
            if (compare(i) == true) { // 같은수가 있다면
                continue;
            } else { // 같은수가 없다면
                int e;
                if ((e = empty(i)) != -1) { // 빈공간있다면
                    multi[e] = in[i];
                    m[e] = true;
                } else { // 빈공간없다면
                    multi[future(i)] = in[i]; // 가장 뒤에 나오는것을 먼저 뽑기
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