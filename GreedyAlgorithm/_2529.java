package GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



/*
주어진 부등호로 최댓값을 만들어야한다.

9>8>7>6>5>4>3>2>1>0

<><>><<<><

dfs 알고리즘을 사용하기

9로시작 -> 불가능
8로 시작 -> ...
들어갔다가 나오기 
7로 시작 -> ...
6로 시작 -> ...

백트래킹 어떤식으로 만약에 if문을 만족하지 않는다면
그리고 어떤 수보다 작다면
1.
2.
3.
..
의 결과값들이 나올것임


*/


/*
내가 했던것은 방문했던곳을 단순히 출력하는것임
노드가 어떤식으로 그려져있는지는 모르나
9로 시작될경우 쭉검사하고
8로 시작될경우 쭉검사하고
..
0로 시작될경우 쭉검사하는 방식으로 한다고 치고
9로 시작될경우 그 밑에는 
8로 시작될경우 그 밑에는 전부다 방문
0
 0
  0
   0

*/
public class _2529 {

    static boolean visited[] = new boolean[10];
    static int xy[][] = new int[10][10];
    static String comparison[];

    public static void dfs(int n){ // 9 > 5 
        
        visited[n] = true;//방문했고

        for(int i = 0; i < comparison.length ; i++){
            for (int j = 0; j < 10; j++) {                
                if(comparison[i].equals("<")){
                    if(n < i)
                        visited[i] = true;
                    else    
                        dfs(i);
                }
                
            }

        }
        

    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        comparison = br.readLine().split(" ");
        
        // 탐색 시작 9 8 7 6 5 4 3 2 1 0 
        // 9로 시작해서 0으로 끝남
        // stack처럼 쌓는다가 point이다. recursive call,
        // xy의 값을 row에다가 넣고 
        for(int[] row: xy)
            Arrays.fill(row, 1);
        for (int i = 0; i < xy.length; i++)
            xy[i][i] = 0;
        Arrays.fill(visited, false);
        
        for(int i = 0; i < 10 ; i++){
            dfs(i);
        }
        

        

    }
    
    
}