package GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Algorithm{
    int man;
    StringTokenizer st;
    int order[] = null;
    Algorithm(int man,StringTokenizer st){
        this.man = man;
        this.st = st;
        order = new int[man];
        for (int i = 0; i < man; i++) {
             order[i] = Integer.parseInt(st.nextToken());          
    
        }
    }
    
    void order(){
        Arrays.sort(order);
        int sum = 0;
        int result = 0;
        for (int i = 0; i < order.length; i++) {
            //System.out.print(order[i]+ " ");
            sum += order[i];   
            result += sum;
        }
        System.out.print(result);
        
    }
}

public class _11047 {

    public static void main(String[] args){
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        System.out.print("input the number of man : ");
        int man = sc.nextInt();
        try{
            System.out.print("input the time in order : ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            Algorithm ag = new Algorithm(man, st);
            ag.order();
        } catch (IOException e){
            e.printStackTrace();
        }
        
        sc.close();
        

    
    }
}