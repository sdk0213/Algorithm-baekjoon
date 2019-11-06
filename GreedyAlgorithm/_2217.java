package GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
2
10
15
1500
2000
3000
4000
5000

����ū���� ȥ�� ��� 5000
�׺��� �������� ���ؼ� ��� 4000 * 2
�׺��� �������� ���ؼ� ��� 3000 * 3 


*/

public class _2217{
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int count = Integer.parseInt(br.readLine());
            List<Integer> list = new ArrayList<Integer>();
            List<Integer> sum = new ArrayList<Integer>();
            for (int i = 0; i < count; i++) {
                list.add(i,Integer.parseInt(br.readLine()));
            }

            Collections.sort(list,Collections.reverseOrder());


            for (int i = 0; i < list.size() ;  i++) {
                sum.add(i,list.get(i) * (i+1) );
            }

            Collections.sort(sum);

            System.out.println(sum.get(sum.size() - 1));
            

        } catch (IOException e){
            e.printStackTrace();
        }


    }

}