package GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// ��Ű�� vs ����
// 6������ vs 6���̻�
// ���δ� ����� �����Ϳ����� ��Ű�� vs ���� 
public class _1049 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int cutoff = Integer.parseInt(input[0]), brand = Integer.parseInt(input[1]), pkg[] = new int[brand],col[] = new int[brand],cut;
        if(cutoff < 6 )
            cut = cutoff;   
        else
            cut = 6;
        for (int i = 0; i < brand; i++) { 
            input = br.readLine().split(" "); 
            pkg[i] = Integer.parseInt(input[0]);
            col[i] = Integer.parseInt(input[1])*cut;   // 1234566666..  �̷������� �񱳸� �ؾ��ϱ� ������ cut�� �����ϴ°�
        }
        Arrays.sort(pkg);
        Arrays.sort(col);
        if(pkg[0] > col[0]){ // ������ ���Ұ��
            System.out.println(cutoff*(col[0]/cut));
        }
        else{ // ��Ű���� �� �Ұ�� 
            if(cut < 6)
                System.out.println(pkg[0]);
            else{ 
                if(col[0]/cut*(cutoff % 6)  < pkg[0]) // ��Ű���� �� �ΰ� �� �������� �����Ұ�쿡�� ������ �� �����Ѱ��
                    System.out.println(pkg[0]*(int)(cutoff/cut) + (col[0]/cut)*(cutoff % 6) );  
                else                                  // ��Ű���� �� �ΰ� �� �������� �����Ѱ�쿡�� ��Ű���� �� �Ѱ��
                    System.out.println(pkg[0]*(int)(cutoff/cut) + pkg[0] );
            }
        }

    }
}