package GreedyAlgorithm;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;

public class _8990{
    
    public static void main(String args) {

        Scanner inputScanner = new Scanner(System.in);
        int Town = inputScanner.nextInt();
        int Truck = inputScanner.nextInt();
        int Box_Info = inputScanner.nextInt();
        int Box_Info_AtoB_Weight[][] = new int[Box_Info][3];

        for (int i = 0; i < Box_Info; i++) 
            for (int j = 0; j < 3; j++) 
                Box_Info_AtoB_Weight[i][j] = inputScanner.nextInt();

        Arrays.sort(Box_Info_AtoB_Weight, new Comparator<int[]>() {
            public int compare(int[] back, int[] forth){
                if(back[0] == forth[0])
                    return back[1] - forth[1];
                else
                    return back[1] - forth[1];

            }
        });

        for (int i = 0; i < Box_Info; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(Box_Info_AtoB_Weight[i][j]+" ");
            }
            System.out.println();
        }

        inputScanner.close();
    }

}