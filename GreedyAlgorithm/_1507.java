package GreedyAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class _1507 {

    static int street[][];
    static boolean visited[];
    static int min;
    static int N;
    static int dap;
    static int no=0;
    static int chso=Integer.MAX_VALUE;
    static int error = 0;
    static void highwway(int i,int c,int j,int sum,int count){
        visited[i] = true;
        // System.out.println(i+","+ j + " sum = " + sum + " min = "+min);
        // for (int k = 0; k < visited.length; k++) {
        //     System.out.print(visited[k]+" ");
        // }
        // System.out.println();
        if(visited[j] == true && min >= sum && count>1){
            System.out.println("sum : "+sum+" street["+c+"]["+j+"] : "+ street[c][j]);
            if(chso >= sum) chso = sum;            
            visited[i] = false;
            return;
        }
        
        for (int k = 0; k < N; k++) {
            if(min >= sum+street[i][k] && street[i][k] != 0 && visited[k]==false){ 
                highwway(k, c, j, sum+street[i][k],count+1);
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
                highwway(i, i, j, 0,0);
                System.out.print((i+1)+","+(j+1));
                if(chso == Integer.MAX_VALUE ){
                     System.out.println(" : 건설"); 
                    dap += street[i][j];
                } 
                else if(chso != min){ 
                    System.out.println("min : "+min + " chso : "+chso + "  error");
                    error = 1;
                    chso = Integer.MAX_VALUE;
                    break;
                }
                else{
                    System.out.println(" : 건설"); 
                    dap += street[i][j];
                    chso = Integer.MAX_VALUE;
                }
                System.out.println(chso);
                
                Arrays.fill(visited,false);
            }      
        } 
        
        if(error == 1) System.out.println(-1);
        else System.out.println(dap);
        sc.close();

        

    }
    
}