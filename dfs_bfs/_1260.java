package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


/*
첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000), 탐색을 시작할 정점의 번호 V가 주어진다. 
다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다. 어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다. 
입력으로 주어지는 간선은 양방향이다.

input : 
4 5 1
1 2
1 3
1 4
2 4
3 4

output: 
1 2 4 3  // dfs
1 2 3 4  // bfs

*/


public class _1260 {
    static int visited[];
    static int xy[][];
    static String imsi[];
    static int N,M,V;

    public static void dfs(int v){
        visited[v] = 1;
        System.out.print(v + " ");
        for (int i = 1; i < N+1; i++) {
            if(visited[i] == 0 && xy[v][i] == 1 ) // 만약에 방문하지 않았고 둘이 연결되어있다면
                dfs(i);		// recursive call 을 사용하여 stack 처럼 쌓는다.
                		   // 출력 -> 그다음 노드탐색 -> 출력 ->  그다음노드 탐색 
                           // 이해가 안간다면 youtube dfs,bfs 참고바람
        }

    }

    public static void bfs(int v){
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(v);
        visited[v] = 1;
        while(!q.isEmpty()){ // q가 비어질때까지 방문이 모두 종료되면 queue는 비어진다.
            v = q.poll();
            System.out.print(v + " ");
            for (int i = 1; i < N+1; i++) {
                if(visited[i] == 0 && xy[v][i] == 1){ // 만약에 방문하지 않았고 둘이 연결되어있다면
                    q.offer(i); // 값을 queue에다가 집어넣기
                    visited[i] = 1;
                }
            }

        }

    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a[] = br.readLine().split(" "); // 
        N = Integer.parseInt(a[0]);
        M = Integer.parseInt(a[1]);
        V = Integer.parseInt(a[2]);    

                
        xy = new int[N+1][N+1]; // 전체 점에서 1개씩 더하면된다. 
        						// 문제를 보면은 주어진 정점번호가 1부터 시작하기 때문이다.
        for (int i = 0 ; i < M; i++) {
            imsi = br.readLine().split(" ");
            xy[Integer.parseInt(imsi[0])][Integer.parseInt(imsi[1])] = xy[Integer.parseInt(imsi[1])][Integer.parseInt(imsi[0])] =  1;
        }
        visited = new int[N+1]; // 주어진 정점번호가 1부터 시작하기 때문이다.
        Arrays.fill(visited, 0);
        dfs(V);
        System.out.println();
        Arrays.fill(visited, 0);
        bfs(V);
        

    }



}