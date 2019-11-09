package GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
세준이는 양수와 +, -, 그리고 괄호를 가지고 길이가 최대 50인 식을 만들었다. 그리고 나서 세준이는 괄호를 모두 지웠다.
그리고 나서 세준이는 괄호를 적절히 쳐서 이 식의 값을 최소로 만들려고 한다.
괄호를 적절히 쳐서 이 식의 값을 최소로 만드는 프로그램을 작성하시오.

입력
첫째 줄에 식이 주어진다. 식은 ‘0’~‘9’, ‘+’, 그리고 ‘-’만으로 이루어져 있고, 가장 처음과 마지막 문자는 숫자이다. 
그리고 연속해서 두 개 이상의 연산자가 나타나지 않고, 5자리보다 많이 연속되는 숫자는 없다. 수는 0으로 시작할 수 있다.

입력          출력
55-50+40     -35
*/

/*
예를들어서 124+31-353+205 괄호가 + - 에 영향을 줄수있나?
만약에 (12+20) 이런식일때 만약에 곱셈으로 작용이 가능하다면?
아니다. 곱셈을 뜻하는것이 아니다.
55 - 50 + 40 에서 - 50 다음에 괄호는 치면 된다.
어디까지 ? - 가 나올때까지

325 + 235 - 3535 - (2352 + 12 +  3535) - 3535 + 

1) -를 찾는다. 그다음 마이너가 나올때까지 연산자를 전부 -로 바꾼다.
2) 값을 구한다.

*/

public class _1541 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cal = br.readLine();
        List<String> Num = new ArrayList<String>();
        for (int i = 0; i < cal.length(); i++) {
            Num.add(cal.charAt(i) + ""); // 전부빼서 리스트에 저장하기
        }

        int k = 0;
        for (int i = k; i < cal.length(); i++) {
            if (Num.get(i).equals("-")) {
                for (int j = i; j < cal.length(); j++) { // - 를 찾았으면 그 다음에 연산자가 있는지 찾는 과정 필요
                                                         // 연사자는 +,- 로 이루어져있음
                    if (Num.get(j).equals("+")) {
                        Num.set(j, "-"); // list 수정이 필요함
                    }

                    if (Num.get(j).equals("-")) { // 만약에 - 라면 다시 원래대로 for문으로 돌아감 그 자리를 찾아줌
                        k = j; // 해당 찾은것부터 다시 검색
                    }
                }
            }
        }
        
        int total = 0;
        boolean plus = true;
        cal = "";
        // 첫항은 ture다. piv는 0부터 찾은항i까지
        // 두번재항은 전에찾은 연산자부터
        // System.out.println(Num);
        for (int i = 0; i < Num.size(); i++) {
            if (Num.get(i).equals("+") || Num.get(i).equals("-")){ //연산자라면
                // System.out.println(Num.get(i)); 
                if (plus == true)
                    total += Integer.parseInt(cal); 
                if (plus == false)
                    total -= Integer.parseInt(cal); 

                if(Num.get(i).equals("+")) plus=true;
                if(Num.get(i).equals("-")) plus=false;
                cal=""; // cal 초기화
            }
            else{
                cal += Num.get(i); // string 숫자 만듬
            }
            // System.out.println("Total : " + total + " i =" + i);

        }
        if (plus == true)
        total += Integer.parseInt(cal); 
         if (plus == false)
        total -= Integer.parseInt(cal); 
            

        System.out.println(total);

    }

}