package GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class _5585{
    public static void main(String[] args) {
        try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int pay = Integer.parseInt(br.readLine());
        pay = 1000 - pay;
        int coin[] = new int[]{500,100,50,10,5,1};
        
        int i = 0;
        int count = 0;
        while(pay != 0){

            if(pay >= coin[i]){
                count++;
                pay -= coin[i];
                continue;
            }
            i++;
            
        }

        System.out.println(count);


        } catch(IOException e){
            e.printStackTrace();
        }



    }

}