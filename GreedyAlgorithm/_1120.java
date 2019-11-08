package GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


// A와 B의 길이가 같으면서, A와 B의 차이를 최소가 되도록 했을 때, 그 차이를 출력하시오.
// 어떻게서든지 최소가 되게 하고 차이를 출력하면됨
// bbf abbf 둘을비교할경우
// abbf >> a를 왼쪽에다가 추가할경우 모두 다 같아서 '0' 이 된다.
// bbfa >> a를 오른쪽에다가 추가할경우 모두 다 틀려서 '3' 이된다.
// 부족한수만큼 왼쪽에서부터 대입하면됨
// 다른예로
// asdhkg(6) gjkasjhlf(9) 이런식일때
// gjk 를 왼쪽에 넣거나 오른쪽에 넣을을때 가운데가 맞는다는 보장은 무엇으로 할수있는가?
// 결론적으로 두개만 비교해보면된다.
// 개수의 차이만큼 왼쪽에서 투입시키면된다. 
//  aa dgdsdgjkl
//     aa     aa
// 다른방법이 있을까? 더 최소화시킬수있는방법 
//   dd  ggddgg
//   앞뒤로 ggddgg 시켜주면 가능하다.
// 그러므로 내가 했던 방식은 다른방식이다.
// 가장 최소화가되는 방향에서 앞뒤로 추가해줘야함
// 일단은 자신이랑 비슷한것을 찾고 그뒤로 앞뒤로 추가
// 1. 자신이랑 비슷한것을 찾는다.
// 2. 앞뒤로 추가해준다.
// 


public class _1120 {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();
        List<String> m = new ArrayList<String>();
        List<String> m2 = new ArrayList<String>();

        for (int i = 0; i < A.length(); i++) {
            m.add(String.valueOf(A.charAt(i)));    // String A []  ==> list m
        }

        for (int i = 0; i < B.length(); i++) {
            m2.add(String.valueOf(B.charAt(i)));   // String B []  ==> list m2
        }

        // A랑 B랑 비교해서 가장 비슷한 부분을 찾기
        // bb  ggbbgg 있을때
        // A의 항 A.legnth (자기자신)만큼 비교하면된다.
        // B의 사이즈 끝까지    

        int min=999;
        int count=0;
        int k=0;
        for (int j = 0; j <= m2.size() - m.size(); j++) {       // 0.1.2.3.4.5.6 언제까지? 끝이 될??까지 끝은 언제되나? 전체사이즈에서 - m.size()까지
            // System.out.println("m2.size - m.size : " + (m2.size() - m.size()));
            for (int i = j ; i < j + m.size(); i++,k++) {    // j부터 J + m.size()까지하고 k 는 따로 설정하여서 m을 항상 0부터 자기사이즈까지 비교하기
                // System.out.println("k : " + k + " i : " + i + " j : " + j);
                if (m.get(k).equals(m2.get(i))) { // 0,j 1,j+1, 2,j+2 3,j+3 4,j+4  /*0,1,2,3,4... m.size() 까지*/ 

                } else {
                    count++; // 각각을 비교해서 가장 낮은것의 수치를 적어주면된다. 그리고 해당수치에서 앞뒤로 추가해주면 그것이 가장 최적임
                } // 가장 낮은수치를 계속 비교하여서 (temp) min값을 구하면됨
            }
            if(min >= count){ // 한번 비교가 끝나면 그값을 전값과 비교                
                min = count;
            }
            // System.out.println(min);
            count=0;  // count초기화
            k=0;
        }

        System.out.println(min);

        // 해당 비교가 끝나면 앞뒤로 추가해주었을때의 값은
        // bb ggbbgg 일때 앞뒤로 무엇이 추가되는지는 내 알바가 아니지만 최소 A와 B의 차이만큼은 보장해줄수있음
        // bb bb  어쨌든 4보장
        //     bb  어쨋든 4보장
        //      bb  어?든 4보장
        
        // System.out.println( (B.length() - A.length()) - 1 + min );

    }
}