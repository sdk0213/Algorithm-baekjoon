package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _1182{

    static int n[] = new int[99];
    static int count;
    static int dfs(int n){
        if(n==99) return 100;        
        n++;
        System.out.println(dfs(n));        
        return n;
    }

    public static void main(String args[]) throws IOException{

        // Scanner sc = new Scanner(System.in);
        // count = sc.nextInt();
        // for(int i = 0 ; i < 7 ; i++)
        //     n[i] = sc.nextInt();

        dfs(0);
        //sc.close();

    }
}