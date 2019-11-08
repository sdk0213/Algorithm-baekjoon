package GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


// A�� B�� ���̰� �����鼭, A�� B�� ���̸� �ּҰ� �ǵ��� ���� ��, �� ���̸� ����Ͻÿ�.
// ��Լ����� �ּҰ� �ǰ� �ϰ� ���̸� ����ϸ��
// bbf abbf �������Ұ��
// abbf >> a�� ���ʿ��ٰ� �߰��Ұ�� ��� �� ���Ƽ� '0' �� �ȴ�.
// bbfa >> a�� �����ʿ��ٰ� �߰��Ұ�� ��� �� Ʋ���� '3' �̵ȴ�.
// �����Ѽ���ŭ ���ʿ������� �����ϸ��
// �ٸ�����
// asdhkg(6) gjkasjhlf(9) �̷����϶�
// gjk �� ���ʿ� �ְų� �����ʿ� �������� ����� �´´ٴ� ������ �������� �Ҽ��ִ°�?
// ��������� �ΰ��� ���غ���ȴ�.
// ������ ���̸�ŭ ���ʿ��� ���Խ�Ű��ȴ�. 
//  aa dgdsdgjkl
//     aa     aa
// �ٸ������ ������? �� �ּ�ȭ��ų���ִ¹�� 
//   dd  ggddgg
//   �յڷ� ggddgg �����ָ� �����ϴ�.
// �׷��Ƿ� ���� �ߴ� ����� �ٸ�����̴�.
// ���� �ּ�ȭ���Ǵ� ���⿡�� �յڷ� �߰��������
// �ϴ��� �ڽ��̶� ����Ѱ��� ã�� �׵ڷ� �յڷ� �߰�
// 1. �ڽ��̶� ����Ѱ��� ã�´�.
// 2. �յڷ� �߰����ش�.
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

        // A�� B�� ���ؼ� ���� ����� �κ��� ã��
        // bb  ggbbgg ������
        // A�� �� A.legnth (�ڱ��ڽ�)��ŭ ���ϸ�ȴ�.
        // B�� ������ ������    

        int min=999;
        int count=0;
        int k=0;
        for (int j = 0; j <= m2.size() - m.size(); j++) {       // 0.1.2.3.4.5.6 ��������? ���� ��??���� ���� �����ǳ�? ��ü������� - m.size()����
            // System.out.println("m2.size - m.size : " + (m2.size() - m.size()));
            for (int i = j ; i < j + m.size(); i++,k++) {    // j���� J + m.size()�����ϰ� k �� ���� �����Ͽ��� m�� �׻� 0���� �ڱ��������� ���ϱ�
                // System.out.println("k : " + k + " i : " + i + " j : " + j);
                if (m.get(k).equals(m2.get(i))) { // 0,j 1,j+1, 2,j+2 3,j+3 4,j+4  /*0,1,2,3,4... m.size() ����*/ 

                } else {
                    count++; // ������ ���ؼ� ���� �������� ��ġ�� �����ָ�ȴ�. �׸��� �ش��ġ���� �յڷ� �߰����ָ� �װ��� ���� ������
                } // ���� ������ġ�� ��� ���Ͽ��� (temp) min���� ���ϸ��
            }
            if(min >= count){ // �ѹ� �񱳰� ������ �װ��� ������ ��                
                min = count;
            }
            // System.out.println(min);
            count=0;  // count�ʱ�ȭ
            k=0;
        }

        System.out.println(min);

        // �ش� �񱳰� ������ �յڷ� �߰����־������� ����
        // bb ggbbgg �϶� �յڷ� ������ �߰��Ǵ����� �� �˹ٰ� �ƴ����� �ּ� A�� B�� ���̸�ŭ�� �������ټ�����
        // bb bb  ��·�� 4����
        //     bb  ��¶�� 4����
        //      bb  ��?�� 4����
        
        // System.out.println( (B.length() - A.length()) - 1 + min );

    }
}