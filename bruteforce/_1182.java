package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1182{

    static int n[];
    static int dap=0;
    static int s;
    static int count;
    static void dfs(int hap,int depth,int gong){
        if(depth == count){
            if( hap == s && gong != count){

                dap++;
            }
            return;
        }
        dfs(hap+n[depth],depth+1,gong);
        dfs(hap+0,depth+1,gong+1);
        
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String q[] = br.readLine().split(" ");
        count = Integer.parseInt(q[0]);
        s = Integer.parseInt(q[1]);
        n = new int[30];
        q = br.readLine().split(" ");
        for(int i = 0 ; i < count ; i++)
            n[i] = Integer.parseInt(q[i]);

        dfs(0,0,0);
        System.out.println(dap);
       



    }
}