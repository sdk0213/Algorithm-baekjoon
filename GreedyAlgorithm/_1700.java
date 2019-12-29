package GreedyAlgorithm;

import java.util.Scanner;

public class _1700 {
    static int N, K;
    static int multi[];
    static int in[];

    static boolean compare(int i) {
        for (int j = 0; j < N; j++)
            if (in[i] == multi[j])
                return true;
        return false;
    }

    static boolean use(int a, int i) {
        for (int j = 1; j <= 2 * (N - 1); j++) {
            if ((i + j) >= in.length)
                continue;
            if (multi[a] == in[i + j]) {
                // System.out.println("multi["+a+"] == in["+i+j+"]");
                return true;
            }
        }

        return false;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        multi = new int[N]; // ¸ÖÆ¼ÅÇ
        in = new int[K];
        int result=0;

        int count=0;
        int last = 0;

        for (int i = 0; i < K; i++)
            in[i] = sc.nextInt();
 

        for (int i = 0; i < K; i++) {
            if (compare(i) == false) {
                multi[count] = in[i];
                count++;
                last = i;
                if(count == N) break;
            }
        }

        for (int i = 0; i < multi.length; i++) {
            System.out.print(multi[i]+"");
        }
        
        
        

        for (int i = last; i < K; i++) {
            if(compare(i)==false){
                for(int j = 0; j < N; j++) {
                    if(j==N-1){
                        result++;
                        multi[j] = in[i];
                        System.out.println("out");
                        System.out.println("result : "+result + " multi : " +multi[0]+""+multi[1]+""+multi[2]); 
                        break;
                    } 
                    if(use(j,i)==false){ // j ¸ÖÆ¼ÅÇ i µé¾î¿Ã°Å
                        result++;
                        multi[j] = in[i];
                        System.out.println("result : "+result + " multi : " +multi[0]+""+multi[1]+""+multi[2]); 
                        break;
                    } 
                }
                 
            }
             

        }

        System.out.println(result);

        
        sc.close();

        

    }
}