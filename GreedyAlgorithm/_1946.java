package GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 시간초과문제
// 1. 배열말고 리스트를 사용해야된다.
// 반복문을 사용하는것은 맞을것임
// 1. 내림차순정렬ㅇ

public class _1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트케이스 갯수
        int N;
        int[][] rank = null;
        StringTokenizer st = null;
        int result[] = new int[T];
        for (int i = 0; i < T; i++) { // 테스트케이스의 갯수만큼 반복함
            N = Integer.parseInt(br.readLine()); // 몇명의 입사지원자가 있는지
            rank = new int[N][2];
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                rank[j][0] = Integer.parseInt(st.nextToken());
                rank[j][1] = Integer.parseInt(st.nextToken());

            }

            Arrays.sort(rank, new Comparator<int[]>() { // 첫째항을 기준으로 오름차순으로 정리한다
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

            // 끝에서부터 만약에 2번째 항이 내려가면서 자기자신보다 작은숫자가 있다면 X
            // 정답 : 전체 사이즈 - X
            // 배열은 [2] 만들면 [0] [1] 까지만 사용가능

            int X = 0;
            for (int j = 0; j < rank.length; j++) {
                // System.out.println(" j : " + j + " rank.length : " + rank.length);
                for (int c = rank.length - 1 - j; c > 0; c--) { // 자기 자신보다 작은숫자나오면 X
                    // System.out.println(rank[rank.length - 1 - j][1] + " // " + rank[c - 1][1]);
                    if (rank[rank.length - 1 - j][1] > rank[c - 1][1]) { // 자기자신부터 아래까지 그러니까 5개면 4,3 4,2 4,1 4,0
                        X++;
                        break;
                    }
                }
            }
            // System.out.println(" X : " + X + " rank.lenght : "+ rank.length);

            // 자기 보다 작은것들을 반복
            
            result[i] = rank.length - X;

        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
}