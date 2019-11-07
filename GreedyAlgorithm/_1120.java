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