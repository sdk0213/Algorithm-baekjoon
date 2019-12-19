package GreedyAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class _2437 {
    static int weight[];
    static int pivot, sum;

    static void ck_continuity() {

        for (int i = 1; i < weight.length; i++) {
            if (weight[i] - weight[i - 1] <= 1)
                pivot = i;
            else
                break;
        }
    }

    static void find_min() {
        for (int i = pivot+1; i < weight.length; i++) {
            if (weight[i] > (sum + 1)){
                break;
            }
            else
                sum += weight[i];
        }

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        weight = new int[N];
        for (int i = 0; i < N; i++) {
            weight[i] = sc.nextInt();
        }
        Arrays.sort(weight);


        if (Arrays.binarySearch(weight, 1) < 0) // 이진탐색으로 1이 없다면 1출력
            System.out.println("1");
        else if(N==1){
            if(weight[0] != 1)
                System.out.println("1");
            else   
                System.out.println("2");
        }
        else{

            ck_continuity(); // 연속성검사
            
            for (int i = 0; i <= pivot; i++) {
                sum += weight[i];
            }
            // for (int i = 0; i < weight.length; i++) {
            //     System.out.print(weight[i]+" ");
            // }
            // System.out.println();
            // System.out.println("pivot : " + pivot + " sum : "+ sum );
            if(pivot == weight.length-1)
                System.out.println(sum+1);
            else{
                find_min();
                System.out.println(sum+1);
            }

        }

        sc.close();

    }
}