package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _1138 {
    static int height[] = new int[11];
    static List<Integer> list;
    public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       list = new ArrayList<Integer>();
       for (int i = 0; i < N; i++) {
           height[i+1] = sc.nextInt();
       }

        for (int i = N ; i >= 1; i--) {
            list.add(height[i],i);
        }
        
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }

        sc.close();
    }
}