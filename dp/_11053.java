package dp;

import java.io.IOException;
import java.util.Scanner;

public class _11053 {

    static int d[][];
    static int n[] = new int[1001];

    public static void main(String args[]) throws IOException, NumberFormatException {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            n[i] = sc.nextInt();
        }
        // 0 10 20 30 10
        d = new int[ 1 << num ][2];
        
        int count = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < 1 << (i-1); j++) {
                d[count][0] = n[i];
                count++;
            }
        }
        for (int i = 0; i < 1 << num; i++) {
            System.out.println(d[i][0]);
        }
        count=1;
        d[0][0] = 0;
        d[0][1] = 0;
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < 1 << (i-1); j++) {
                if (n[i] > d[j][0])
                    d[count][1] = d[j][1] + 1;
                else
                    d[count][1] = d[j][1];
                // System.out.print(d[count][1]);
                count++;
            }
            // System.out.println();
        }

        System.out.println(d[ (1 << num) - 1][1]);

        /*
        6
        10 20 10 30 20 50

        */
    }
}