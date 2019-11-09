package GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
�����̴� ����� +, -, �׸��� ��ȣ�� ������ ���̰� �ִ� 50�� ���� �������. �׸��� ���� �����̴� ��ȣ�� ��� ������.
�׸��� ���� �����̴� ��ȣ�� ������ �ļ� �� ���� ���� �ּҷ� ������� �Ѵ�.
��ȣ�� ������ �ļ� �� ���� ���� �ּҷ� ����� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ���� �־�����. ���� ��0��~��9��, ��+��, �׸��� ��-�������� �̷���� �ְ�, ���� ó���� ������ ���ڴ� �����̴�. 
�׸��� �����ؼ� �� �� �̻��� �����ڰ� ��Ÿ���� �ʰ�, 5�ڸ����� ���� ���ӵǴ� ���ڴ� ����. ���� 0���� ������ �� �ִ�.

�Է�          ���
55-50+40     -35
*/

/*
������ 124+31-353+205 ��ȣ�� + - �� ������ �ټ��ֳ�?
���࿡ (12+20) �̷����϶� ���࿡ �������� �ۿ��� �����ϴٸ�?
�ƴϴ�. ������ ���ϴ°��� �ƴϴ�.
55 - 50 + 40 ���� - 50 ������ ��ȣ�� ġ�� �ȴ�.
������ ? - �� ���ö�����

325 + 235 - 3535 - (2352 + 12 +  3535) - 3535 + 

1) -�� ã�´�. �״��� ���̳ʰ� ���ö����� �����ڸ� ���� -�� �ٲ۴�.
2) ���� ���Ѵ�.

*/

public class _1541 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cal = br.readLine();
        List<String> Num = new ArrayList<String>();
        for (int i = 0; i < cal.length(); i++) {
            Num.add(cal.charAt(i) + ""); // ���λ��� ����Ʈ�� �����ϱ�
        }

        int k = 0;
        for (int i = k; i < cal.length(); i++) {
            if (Num.get(i).equals("-")) {
                for (int j = i; j < cal.length(); j++) { // - �� ã������ �� ������ �����ڰ� �ִ��� ã�� ���� �ʿ�
                                                         // �����ڴ� +,- �� �̷��������
                    if (Num.get(j).equals("+")) {
                        Num.set(j, "-"); // list ������ �ʿ���
                    }

                    if (Num.get(j).equals("-")) { // ���࿡ - ��� �ٽ� ������� for������ ���ư� �� �ڸ��� ã����
                        k = j; // �ش� ã���ͺ��� �ٽ� �˻�
                    }
                }
            }
        }
        
        int total = 0;
        boolean plus = true;
        cal = "";
        // ù���� ture��. piv�� 0���� ã����i����
        // �ι������� ����ã�� �����ں���
        // System.out.println(Num);
        for (int i = 0; i < Num.size(); i++) {
            if (Num.get(i).equals("+") || Num.get(i).equals("-")){ //�����ڶ��
                // System.out.println(Num.get(i)); 
                if (plus == true)
                    total += Integer.parseInt(cal); 
                if (plus == false)
                    total -= Integer.parseInt(cal); 

                if(Num.get(i).equals("+")) plus=true;
                if(Num.get(i).equals("-")) plus=false;
                cal=""; // cal �ʱ�ȭ
            }
            else{
                cal += Num.get(i); // string ���� ����
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