package backtracking;

import java.util.Scanner;

public class _9963 {
    static int N;
    static Scanner sc = new Scanner(System.in);
    static int num=0;
    static int count;
    static int xy[][];

    public static void dfs(int start) {
        if (start == N-1) {
            // for (int i = 0; i < N; i++) {
            //     for (int j = 0; j < 2; j++) {
            //         System.out.print("결과 : " + xy[i][j]+" ");
            //     }
            //     System.out.println();
            // }
            // System.out.println();
            num++;
        } else {    
            for (int i = 0; i < N; i++) {
                if(isPossible(start+1,i) == true ){
                    xy[start+1][0] = start+1;
                    xy[start+1][1] = i;
                    dfs(start+1); // 검사가 true면
                }                   // 들어가서 3,4행검사
            }
        }
    }

    public static boolean isPossible(int a,int b) {
        //xy검사
        for (int i = 0; i < a; i++) {
            if(xy[i][1] == b) // 같은 열에 있다면
                return false;
            if(Math.abs(xy[i][0] - a) == Math.abs(xy[i][1] - b)){ // 대각선이라면
                return false;
            }
        }

        // System.out.println("통과 : " + a+" "+b);
        return true;

    }

    public static void main(String args[]) {
        N = sc.nextInt();
        xy = new int[N][2];
        for (int i = 0; i < N; i++) {
            count = 0;
            xy[0][0] = 0;
            xy[0][1] = i;
            // System.out.println("시작 : " + xy[0][0]+" "+xy[0][1]);
            dfs(0);
        }
        System.out.println(num);
    }

}
