package dp;

/*

어떠한 알고리즘이 해당문제를 푸는데 최적화된 알고리즘인것을 보장할수있는것은 어떻게 알수가 있을까?

문제를 풀다보니 회의감이 든다. 마치 LIS라는 문제라서 LIS로 풀고 DP문제라 DP로 풀고 어떠한 알고리즘이랑 주제에 맞춰서 해당 주제이기때문에 해당 LIS DP 등 해당 알고리즘이 타당한것처럼 보인다.
하지만 이런 알고리즘이 타당한지 타당하지 않는지에 대한 확인은 누가해줄수있는것인가?

문제를 푼사람들은 많지만 전부다 직감에 의해 또는 이러이러할것같아서 하는식으로 시작하여서
마치 그것이 정답인것마냥 코딩을 한 사람들이 많다.


하지만 이것이 정답인지 아닌지랑 상관없이 과정이 타당한것임을 확인해주는것은 누가해줄수있는가?

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
