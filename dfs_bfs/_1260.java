package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


/*
ù° �ٿ� ������ ���� N(1 �� N �� 1,000), ������ ���� M(1 �� M �� 10,000), Ž���� ������ ������ ��ȣ V�� �־�����. 
���� M���� �ٿ��� ������ �����ϴ� �� ������ ��ȣ�� �־�����. � �� ���� ���̿� ���� ���� ������ ���� �� �ִ�. 
�Է����� �־����� ������ ������̴�.

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
            if(visited[i] == 0 && xy[v][i] == 1 ) // ���࿡ �湮���� �ʾҰ� ���� ����Ǿ��ִٸ�
                dfs(i);		// recursive call �� ����Ͽ� stack ó�� �״´�.
                		   // ��� -> �״��� ���Ž�� -> ��� ->  �״������ Ž�� 
                           // ���ذ� �Ȱ��ٸ� youtube dfs,bfs ����ٶ�
        }

    }

    public static void bfs(int v){
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(v);
        visited[v] = 1;
        while(!q.isEmpty()){ // q�� ����������� �湮�� ��� ����Ǹ� queue�� �������.
            v = q.poll();
            System.out.print(v + " ");
            for (int i = 1; i < N+1; i++) {
                if(visited[i] == 0 && xy[v][i] == 1){ // ���࿡ �湮���� �ʾҰ� ���� ����Ǿ��ִٸ�
                    q.offer(i); // ���� queue���ٰ� ����ֱ�
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

                
        xy = new int[N+1][N+1]; // ��ü ������ 1���� ���ϸ�ȴ�. 
        						// ������ ������ �־��� ������ȣ�� 1���� �����ϱ� �����̴�.
        for (int i = 0 ; i < M; i++) {
            imsi = br.readLine().split(" ");
            xy[Integer.parseInt(imsi[0])][Integer.parseInt(imsi[1])] = xy[Integer.parseInt(imsi[1])][Integer.parseInt(imsi[0])] =  1;
        }
        visited = new int[N+1]; // �־��� ������ȣ�� 1���� �����ϱ� �����̴�.
        Arrays.fill(visited, 0);
        dfs(V);
        System.out.println();
        Arrays.fill(visited, 0);
        bfs(V);
        

    }



}