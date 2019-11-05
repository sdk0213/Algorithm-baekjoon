package GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class _11399 {

    public static void main(String[] args){

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int man = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int order[] = new int[man];
            for (int i = 0; i < man; i++)
                order[i] = Integer.parseInt(st.nextToken());
            Arrays.sort(order);
            int sum = 0;
            int result = 0;
            for (int i = 0; i < order.length; i++) {
                sum += order[i];
                result += sum;
            }
            System.out.println(result);

        } catch (IOException e) {
            e.printStackTrace();
        }
        

    
    }
}