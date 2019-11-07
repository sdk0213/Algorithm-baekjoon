package GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*

����Ǽ� 1:
ex) 47 23 3
���л� 23��
���л� 23��
if(���л��� == ���л���)
�����л� : ���л� % 2;

����Ǽ� 2:
ex) 47 26 3
���л� 23��
���л� 26��
if(���л��� > ���л���)
���л����� 23������ ��������
�����л� : ���л��� - ���л��� �Ŀ� ���л� % 2 �� ���ϱ�

����Ǽ� 3:
ex) 63 10 3
���л� 31��
���л� 10��
if(���л��� > ���л���)
���л����� 10������ ��������
�����л� : (���л��� - ���л���)*2 �Ŀ� + ���л� % 2 �� ���ϱ� 
--------------------------------------------------------------------------

����Ǽ� 1)
�����л��� K�� ���ų� Ŭ���
if(�����л� >= K))
���� : ��
�����л��� K���� �������
if( �����л� < K)
K���� �����л��� ����
K -= �����л�
K2 = K�� ���� 3���� ������ + 1   // ����� ������ ���� �ʰ� �ϱ����� K2�� ���γ־����� 
if(K % 3 == 0 ) K2--;                // ���� K�ǰ��� 1���� 3�����ϰ�� 1�������� �ı��ǰ��ϰ�
���� : �� -= K                          //  ���� K�ǰ��� 4���� 6�����ϰ�� 2�������� �ı��Ǵ½����� ��������
                                            //  123 456 789 101112 ..

                                            //  001 112 223   3 3  4 (3���� �����������)

                                            //     1    2    3   4        ( 001�� 1������ 112�� 2�������� �ı��Ǿ��ϴϱ�)

                                            //  ������ 3�� �����ϰ� +1�� ���������� % 3 == 0 �϶��� -1�� �ѹ��� ���ش�.
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