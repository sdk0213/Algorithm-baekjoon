package GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _11047 {

    public static void main(String[] args){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int coin[] = new int[N];
            for (int i = 0; i < N; i++) 
                coin[i] = Integer.parseInt(br.readLine());
            int count=0;
            while(K != 0){
                    for (int i = coin.length - 1; i >= 0; i--) {
                        if(coin[i] <= K){
                            K -= coin[i];
                            break;
                        }
                    }
                    count++;

            }
            System.out.println(count);
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        

    
    }
}