package GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



/*
�־��� �ε�ȣ�� �ִ��� �������Ѵ�.

9>8>7>6>5>4>3>2>1>0

<><>><<<><

dfs �˰����� ����ϱ�

9�ν��� -> �Ұ���
8�� ���� -> ...
���ٰ� ������ 
7�� ���� -> ...
6�� ���� -> ...

��Ʈ��ŷ ������� ���࿡ if���� �������� �ʴ´ٸ�
�׸��� � ������ �۴ٸ�
1.
2.
3.
..
�� ��������� ���ð���


*/


/*
���� �ߴ����� �湮�ߴ����� �ܼ��� ����ϴ°���
��尡 ������� �׷����ִ����� �𸣳�
9�� ���۵ɰ�� �߰˻��ϰ�
8�� ���۵ɰ�� �߰˻��ϰ�
..
0�� ���۵ɰ�� �߰˻��ϴ� ������� �Ѵٰ� ġ��
9�� ���۵ɰ�� �� �ؿ��� 
8�� ���۵ɰ�� �� �ؿ��� ���δ� �湮
0
 0
  0
   0

*/
public class _2529 {

    static int visited[] = new int[10];
    static int xy[][] = new int[10][10];
    public static void dfs(int n){
    
        for (int i = 0; i < n; i++) {
            
        //    if() // ������ �ȵǾ��ִٸ� visited==0 �̶��  
        }
        

    }


    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int n = Integer.parseInt(br.readLine());
        // 9 
        


        // String comparison[] = br.readLine().split(" ");
        
        // Ž�� ���� 9 8 7 6 5 4 3 2 1 0 
        // 9�� �����ؼ� 0���� ����
        // stackó�� �״´ٰ� point�̴�. recursive call,
        for(int[] row: xy) {
            Arrays.fill(row, 1);
        }
        System.out.println(xy.length);
        for (int i = 0; i < xy.length; i++) {
            xy[i][i] = 0;
        }
        for (int i = 0; i < xy.length; i++) {
            for (int j = 0; j < xy[i].length; j++) {
                System.out.print(xy[i][j]+" ");
            }
            System.out.println();
        }
        // for(int i = 0; i < n ; i++){
        //     dfs(i);
        // }
        

        

    }
    
    
}