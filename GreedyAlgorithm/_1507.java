package GreedyAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class _1507 {

    static int street[][];
    static boolean visited[];
    static int min;
    static int N;
    static void highwway(int i,int j,int sum,int count){
        visited[i] = true;
        // System.out.println(i+","+ j + " sum = " + sum + " min = "+min);
        // for (int k = 0; k < visited.length; k++) {
        //     System.out.print(visited[k]+" ");
        // }
        // System.out.println();
        if(visited[j] == true && min < sum && count>1){
            System.out.println("true");
            return;
        }
        
        for (int k = 0; k < N; k++) {
            if(min >= sum+street[i][k] && street[i][k] != 0 && visited[k]==false){ //방문하지 않았고 자기자신이 아니고 작을경우
                highwway(k, j, sum+street[i][k],count+1);
            }
        }
        
        visited[i] = false;
        

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        street = new int[N][N];
        visited = new boolean[N];
        Arrays.fill(visited,false);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                street[i][j] = sc.nextInt();
            }   
        }

        for (int i = 0; i < N; i++) {
            for (int j = 1+i; j < N; j++){
                min = street[i][j];
                System.out.println(i+","+j+" 시작 " );
                highwway(i, j, 0,0);
                Arrays.fill(visited,false);
            }      
        } 
        sc.close();

        

    }
    
}