package GreedyAlgorithm;

import java.util.Scanner;

/*
1. �־��� ������ ���Ը� �������� �����Ѵ�. �׸��� ������ �������� �����Ѵ�.
2. �Է¹��� ������ ������������ �����Ѵ�.
3. ���԰� ���峷���ͺ��� ����Ͽ��� ���濡 ���� ������ ���� ��ġ�ִ°ͺ��� ���濡 ����ִ´�.
4. ���� ���԰� �����ͺ��� �ϴ� ������ �����ͺ��� �Ұ�� ���� �������濡 ���� �� ������ ū���濡 ����������ν� �����Ҽ��ֱ� �����̴�.
*/
public class _1202{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int jewelry_Num = sc.nextInt();
        int bag_Num = sc.nextInt();
        int jewelry[][] = new int[jewelry_Num][2];
        int bag[] = new int[bag_Num];

        for (int i = 0; i < jewelry_Num; i++) {
            jewelry[i][0] = sc.nextInt();
            jewelry[i][1] = sc.nextInt();
        }

        for (int i = 0; i < bag_Num; i++) 
            bag[i] = sc.nextInt();
        
        // jewelry[][] �� ������������ ����(1.���� 2.����)
        // bag[i] �� ������������ ����
        // while(){
        //    bag[i] �������� ���ļ������ jewelry[][] �ش� ���Կ� ���� ���� ������ �˻��� bag[i]���ٰ� �ְ�(�־��ٰ� ġ��) ����
        //  }
        // �˻��Ҷ��� bag[i] ���� �����͵��� ���� �˻��ؾ��ϰ� ���߿��� ���� ����ġ �ִ°��� �־����
        // 5�� ������ ���濡 �� ��󸮸� ã������ 1,2,3,4,5 ��(���ĵǾ�����) �� ���� ��ġ�� �������� ã�����
        //  
        


    
        sc.close();


        
        

    }
}