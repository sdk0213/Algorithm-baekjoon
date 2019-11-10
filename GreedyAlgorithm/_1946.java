package GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()), N, apply[][];
        int count[] = new int[T], min, rank;
        String s[];

        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());
            apply = new int[N][2];
            for (int j = 0; j < N; j++) {
                s = br.readLine().split(" ");
                rank = Integer.parseInt(s[0]) - 1;
                apply[rank][0] = rank;
                apply[rank][1] = Integer.parseInt(s[1]);
            }
            count[i] = 1;
            min = apply[0][1];
            for (int j = 1; j < apply.length; j++) {
                if (min > apply[j][1]) {
                    min = apply[j][1];
                    count[i]++;
                }
            }
        }

        for (int i = 0; i < count.length; i++) {
            System.out.println(count[i]);
        }

    }
}