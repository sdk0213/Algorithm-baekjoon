package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class _12813{

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String A[] = br.readLine().split("");
        String B[] = br.readLine().split("");

        for (int i = 0; i < A.length; i++) {
            System.out.print(Integer.parseInt(A[i]) & Integer.parseInt(B[i]));
        }
        System.out.println();
        for (int i = 0; i < A.length; i++) {
            System.out.print(Integer.parseInt(A[i]) | Integer.parseInt(B[i]));
        }
        System.out.println();
        
        for (int i = 0; i < A.length; i++) {
            System.out.print(Integer.parseInt(A[i]) ^ Integer.parseInt(B[i]));
        }
        System.out.println();
        
        for (int i = 0; i < A.length; i++) {
            System.out.print(Integer.parseInt(A[i]) ^ 1);
        }
        System.out.println();
        
        for (int i = 0; i < A.length; i++) {
            System.out.print(Integer.parseInt(B[i]) ^ 1);
        }

    }
}