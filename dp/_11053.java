package dp;

/*

��� �˰����� �ش繮���� Ǫ�µ� ����ȭ�� �˰����ΰ��� �����Ҽ��ִ°��� ��� �˼��� ������?

������ Ǯ�ٺ��� ȸ�ǰ��� ���. ��ġ LIS��� ������ LIS�� Ǯ�� DP������ DP�� Ǯ�� ��� �˰����̶� ������ ���缭 �ش� �����̱⶧���� �ش� LIS DP �� �ش� �˰����� Ÿ���Ѱ�ó�� ���δ�.
������ �̷� �˰����� Ÿ������ Ÿ������ �ʴ����� ���� Ȯ���� �������ټ��ִ°��ΰ�?

������ Ǭ������� ������ ���δ� ������ ���� �Ǵ� �̷��̷��ҰͰ��Ƽ� �ϴ½����� �����Ͽ���
��ġ �װ��� �����ΰ͸��� �ڵ��� �� ������� ����.


������ �̰��� �������� �ƴ����� ������� ������ Ÿ���Ѱ����� Ȯ�����ִ°��� �������ټ��ִ°�?

*/



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _11053{

    static int n[];
    static int dap=0;
    static int count;
    static int min=0;
    static boolean max[] = new boolean[1001];
    static void dfs(int hgap,int flag,int depth,int dap){
        if(depth == count){
            System.out.println(dap);
            min = Math.max(min, dap);
            max[dap] = true;
            return;
        }
        // if(hgap < n[depth]){
        if(flag == 1 && hgap >= n[depth]){
            return;
        }
        else{
            dfs(hgap, 0, depth + 1,dap);
            dfs(n[depth], 1, depth + 1,dap+1);
        }

            
        
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String q[] = br.readLine().split(" ");
        count = Integer.parseInt(q[0]);
        n = new int[1001];
        q = br.readLine().split(" ");
        for(int i = 0 ; i < count ; i++)
            n[i] = Integer.parseInt(q[i]);

        dfs(0,0,0,0);
        System.out.println(min);
       



    }
}
