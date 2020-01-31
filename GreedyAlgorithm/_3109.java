package GreedyAlgorithm;

import java.util.Scanner;

public class _3109 {

    static int row;
    static int column;
    static char Gas_RouteMap[][];
    static int Count_GasRount = 0;
    public static void main(String args[]) {

        Scanner inputscanner = new Scanner(System.in);
        row = inputscanner.nextInt();
        column = inputscanner.nextInt();
        Gas_RouteMap = new char[row][column];

        String TempforChar;
        for (int i = 0; i < row; i++) {
            TempforChar = inputscanner.next();
            for (int j = 0; j < column; j++) 
                Gas_RouteMap[i][j] = TempforChar.charAt(j);
        }

        for (int Track = 0; Track < row; Track++) 
            SearchingGasRoute_Backtracking(Track,0);

        inputscanner.close();

        System.out.println(Count_GasRount);

    }

    static boolean SearchingGasRoute_Backtracking(int Track, int Goal) {

        Gas_RouteMap[Track][Goal] = 'x';

        // for (int i = 0; i < row; i++) {
        //     for (int j = 0; j < column; j++) {
        //         System.out.print(Gas_RouteMap[i][j]);
        //     }
        //     System.out.println();
        // }
        // System.out.println(Goal);

        if(Goal == column - 1){
            Count_GasRount++;
            return true;
        }
        
        if( ( (Track-1) >=  0  )  && ( (Goal+1) < column ) && ( Gas_RouteMap[Track-1][Goal+1] == '.' ))
            if(SearchingGasRoute_Backtracking(Track-1,Goal+1) == true)
                return true;
        if( ( (Goal+1) < column ) && ( Gas_RouteMap[Track][Goal+1] == '.' ) )
            if(SearchingGasRoute_Backtracking(Track,Goal+1) == true)
                return true;
        if( ( (Track+1) < row )  && ( (Goal+1) < column ) && ( Gas_RouteMap[Track+1][Goal+1] == '.' ))
            if(SearchingGasRoute_Backtracking(Track+1,Goal+1) == true)
                return true;

        Gas_RouteMap[Track][Goal] = '.';
        
        return false;
    }


    
}