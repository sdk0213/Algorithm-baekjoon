package GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class _1931 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int conf = Integer.parseInt(br.readLine());
            int conf_time[][] = new int[conf][2];
            for (int i = 0; i < conf; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                conf_time[i][0] = Integer.parseInt(st.nextToken());
                conf_time[i][1] = Integer.parseInt(st.nextToken());
            }
            
            Arrays.sort(conf_time, new Comparator<int[]>() {

                @Override
                public int compare(int[] o1, int[] o2) {
                    if(o2[1]==o1[1]) {
                        return o1[0]-o2[0];
                    }
                    return  o1[1] - o2[1];
                }
            });

            int i = 0;
            int j = 0;
            int count=1;
            while(i < conf_time.length){
                if(conf_time[j][1] <= conf_time[i][0]){
                    count++;
                    j = i;
                }
                i++;
            }
            System.out.println(count);
            
            


        } catch (IOException e){
            e.printStackTrace();
        }


    }
}