package GreedyAlgorithm;

import java.util.Comparator;
import java.util.StringTokenizer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _8990{
    
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int Town = Integer.parseInt(st.nextToken());
        int Truck_Size = Integer.parseInt(st.nextToken());
        int Box_Info = Integer.parseInt(br.readLine());
        int Box_Info_AtoB_Weight[][] = new int[Box_Info][3];
        int Town_leftSpace[] = new int[Town + 1];
        Arrays.fill(Town_leftSpace, Truck_Size);

        for (int i = 0; i < Box_Info; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 3; j++) 
                Box_Info_AtoB_Weight[i][j] = Integer.parseInt(st.nextToken());    
        }

        Arrays.sort(Box_Info_AtoB_Weight, new Comparator<int[]>() {
            public int compare(int[] back, int[] forth) {
                return back[1] == forth[1] ? back[0] - forth[0] : back[1] - forth[1];
            }
        });
            
        int Box_Count_Moved = 0;
        int Min_Space=0;
        int Min_Compare=0;

        for (int i = 0; i < Box_Info_AtoB_Weight.length; i++) {
            Min_Space = Truck_Size;
            for (int j = Box_Info_AtoB_Weight[i][0]; j < Box_Info_AtoB_Weight[i][1]; j++)
                if(Min_Space > Town_leftSpace[j]) Min_Space = Town_leftSpace[j];

            if(Min_Space>0){
                Min_Compare = Math.min(Box_Info_AtoB_Weight[i][2], Min_Space);
                Box_Count_Moved += Min_Compare;
                for (int j = Box_Info_AtoB_Weight[i][0]; j < Box_Info_AtoB_Weight[i][1]; j++)
                    Town_leftSpace[j] -= Min_Compare;
            }
        }

        System.out.println(Box_Count_Moved);


    }

}