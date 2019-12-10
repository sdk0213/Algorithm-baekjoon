package dp;

import java.io.IOException;
import java.util.Scanner;

public class _11053 {

    static int d[] = new int[1001];
    static int n[] = new int[1001];

    public static void main(String args[]) throws IOException, NumberFormatException {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            n[i] = sc.nextInt();
        }
        int temp;
        int dap=0;

        for (int i = 1; i < n.length; i++) {
            temp = 1;
            for (int j = 1; j < i; j++) {
                if(n[i] > n[j])
                    temp = Math.max(d[j]+1, temp);
            }
            d[i] = temp;
            dap = Math.max(d[i], dap);

        }

        
        System.out.println(dap);

        sc.close();
    }
}