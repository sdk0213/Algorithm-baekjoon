package GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 패키지 vs 낱개
// 6개이하 vs 6개이상
// 전부다 계산후 남은것에서도 패키지 vs 낱개 
public class _1049 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int cutoff = Integer.parseInt(input[0]), brand = Integer.parseInt(input[1]), pkg[] = new int[brand],col[] = new int[brand],cut;
        if(cutoff < 6 )
            cut = cutoff;   
        else
            cut = 6;
        for (int i = 0; i < brand; i++) { 
            input = br.readLine().split(" "); 
            pkg[i] = Integer.parseInt(input[0]);
            col[i] = Integer.parseInt(input[1])*cut;   // 1234566666..  이런식으로 비교를 해야하기 떄문에 cut을 참고하는것
        }
        Arrays.sort(pkg);
        Arrays.sort(col);
        if(pkg[0] > col[0]){ // 낱개가 더쌀경우
            System.out.println(cutoff*(col[0]/cut));
        }
        else{ // 패키지가 더 쌀경우 
            if(cut < 6)
                System.out.println(pkg[0]);
            else{ 
                if(col[0]/cut*(cutoff % 6)  < pkg[0]) // 패키지가 더 싸고 그 나머지를 구입할경우에도 낱개가 더 유리한경우
                    System.out.println(pkg[0]*(int)(cutoff/cut) + (col[0]/cut)*(cutoff % 6) );  
                else                                  // 패키지가 더 싸고 그 나머지를 구입한경우에도 패키지가 더 싼경우
                    System.out.println(pkg[0]*(int)(cutoff/cut) + pkg[0] );
            }
        }

    }
}