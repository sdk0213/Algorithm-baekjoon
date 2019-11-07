package GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        String N = br.readLine();

        int Numcount[] = new int[10];
        Arrays.fill(Numcount, 0);   //초기화
        int numTotal = 0;   //각자리수를 더한숫자

        for (int i = 0; i < N.length(); i++) {
           Numcount[N.charAt(i) - '0']++;                               // 각자리수를 카운터하기
           numTotal += Integer.valueOf(N.charAt(i) - '0');            // 각자리를 더한숫자 
        }
        
           
        if( Numcount[0] == 0 || numTotal % 3 != 0 ){                // 숫자 0이없다면 불가능 , 모두더한값이 3으로 나눠떨어지지않으면 불가능
            System.out.println("-1");
        }
        else{
            for (int i = 9; i >= 0; i--) {                          // 내림차순으로 쓰기
                while(Numcount[i] != 0){
                    System.out.print(i);
                    Numcount[i]--;
                }
            }
        }
        

    }

}