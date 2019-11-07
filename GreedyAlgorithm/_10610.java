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
        Arrays.fill(Numcount, 0);   //�ʱ�ȭ
        int numTotal = 0;   //���ڸ����� ���Ѽ���

        for (int i = 0; i < N.length(); i++) {
           Numcount[N.charAt(i) - '0']++;                               // ���ڸ����� ī�����ϱ�
           numTotal += Integer.valueOf(N.charAt(i) - '0');            // ���ڸ��� ���Ѽ��� 
        }
        
           
        if( Numcount[0] == 0 || numTotal % 3 != 0 ){                // ���� 0�̾��ٸ� �Ұ��� , ��δ��Ѱ��� 3���� ������������������ �Ұ���
            System.out.println("-1");
        }
        else{
            for (int i = 9; i >= 0; i--) {                          // ������������ ����
                while(Numcount[i] != 0){
                    System.out.print(i);
                    Numcount[i]--;
                }
            }
        }
        

    }

}