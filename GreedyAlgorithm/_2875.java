package GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*

경우의수 1:
ex) 47 23 3
여학생 23팀
남학생 23팀
if(여학생팀 == 남학생팀)
남은학생 : 여학생 % 2;

경우의수 2:
ex) 47 26 3
여학생 23팀
남학생 26팀
if(남학생팀 > 여학생팀)
여학생기준 23개의팀 생성가능
남은학생 : 남학생팀 - 여학생팀 후에 여학생 % 2 를 더하기

경우의수 3:
ex) 63 10 3
여학생 31팀
남학생 10팀
if(여학생팀 > 남학생팀)
남학생기준 10개의팀 생성가능
남은학생 : (여학생팀 - 남학생팀)*2 후에 + 여학생 % 2 를 더하기 
--------------------------------------------------------------------------

경우의수 1)
남은학생이 K랑 같거나 클경우
if(남은학생 >= K))
정답 : 팀
남은학생이 K보다 작을경우
if( 남은학생 < K)
K에서 남은학생을 빼고
K -= 남은학생
K2 = K의 값을 3으로 나누기 + 1   // 계산의 영향을 받지 않게 하기위해 K2를 새로넣었으며 
if(K % 3 == 0 ) K2--;                // 남은 K의값이 1에서 3이하일경우 1개의팀이 파괴되고하고
정답 : 팀 -= K                          //  남은 K의값이 4에서 6이하일경우 2개의팀이 파괴되는식으로 따졌을때
                                            //  123 456 789 101112 ..

                                            //  001 112 223   3 3  4 (3으로 나누었을경우)

                                            //     1    2    3   4        ( 001은 1개의팀 112는 2개의팀이 파괴되야하니까)

                                            //  나누기 3을 시행하고 +1을 시행해준후 % 3 == 0 일때는 -1을 한번더 빼준다.
*/


public class _2875 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int NMK[] = new int[]{Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
   
        int Team;
        int remain;
        if( (NMK[0]/2) == NMK[1]){
            Team = NMK[1];
            remain = NMK[0] % 2;
        }
        else if( NMK[1] > (NMK[0]/2)  ){
            Team = NMK[0]/2;
            remain = (NMK[1] - (NMK[0]/2)) + (NMK[0] % 2);
        }
        else{
            Team = NMK[1];
            remain = (  (NMK[0]/2) - NMK[1])*2 + (NMK[0] % 2);
        }

        if (remain >= NMK[2]){
            System.out.println(Team);
        }
        else{
            int K = 0;
            NMK[2] = NMK[2] - remain;
            K = (NMK[2] / 3) + 1;
            if( NMK[2] % 3 == 0) K--;
            System.out.println(Team - K);
        }

        

    }
}