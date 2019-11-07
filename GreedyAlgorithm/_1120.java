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

public class _1120 {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();
        int compare=0;
        int compare2=0;
        List<String> m = new ArrayList<String>();
        List<String> m2 = new ArrayList<String>();

        for (int i = 0; i < A.length(); i++) {
            m.add(String.valueOf(A.charAt(i)));    
        }

        for (int i = 0; i < B.length(); i++) {
            m2.add(String.valueOf(B.charAt(i)));  
        }

        int sizesub = m2.size() - m.size();

        for (int i = 0; i < sizesub; i++) { // right side add
            m.add(m2.get( m2.size() - sizesub + i ));
        }

        System.out.println(m);
        System.out.println(m2);
        for (int i = 0; i < m.size(); i++) {
            if( m.get(i).equals(m2.get(i)) ){

            }
            else{
                compare++;
            } 
        }

        for (int i = 0; i < sizesub; i++) { // right side remove
            m.remove( m2.size() - sizesub );
        }
        
        for (int i = 0; i < sizesub; i++) { // left side add
            m.add(i,m2.get(i));
        }

        System.out.println(m);
        System.out.println(m2);
        for (int i = 0; i < m.size(); i++) {
            if( m.get(i).equals(m2.get(i)) ){

            }
            else{
                compare2++;
            } 
        }

        if(compare >= compare2) System.out.println(compare2);
        else{
           System.out.println(compare);
        }
        
        


    }
}