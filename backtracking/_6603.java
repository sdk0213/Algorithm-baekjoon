package backtracking;


import java.util.Scanner;

public class _6603 {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int number[] = new int[13];
    static int count;
    static StringBuffer bf = new StringBuffer();
    public static void dfs(int a,String str){

        if(count == 6){
            bf.append(str+"\n"); // 6���� ä�������� bf���ٰ� �ְ� ����
        }
        else{
            for (int i = a + 1; i < n; i++) { // 1 - 2 - 3 - 4 - 5 - 6 - 7 (������������ �Ǿ��ֱ� ������) a+1���� n����
                count++;
                dfs(i,str+number[i]+" ");  // �������� �Ѱ��ֱ�
            }
        }
    
        count--;    // ������ ���ݱ��� �������� count�� --�ؾ��� �������� �����

    }
    public static void main(String args[]){

        while((n = sc.nextInt()) != 0){
        
            for (int j = 0; j < n; j++) {
                number[j] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) { // 1-2-3-4-... ��Ʈ��ŷ
                count=1;                  // 2-3-4-5-... ��Ʈ��ŷ
                dfs(i,number[i]+" ");     // 3-4-5-6.... ��Ʈ��ŷ
            }
            bf.append("\n");

        }
        System.out.println(bf.toString());

    }

}
