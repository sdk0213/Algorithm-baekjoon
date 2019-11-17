package GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _2529 {
    
    static int k;
    static String Inequality[];
    static StringBuffer st = new StringBuffer();
    static int save[] = new int[10];
    static List<String> list = new ArrayList<String>();

    public static void dfs(int start,int count,String dap){
        if(count == k)
            list.add(dap);
        else{
            for (int i = 0; i < 10; i++) {
                if(isPossible(Inequality[count],start,i,count)){
                    // System.out.println(dap + Inequality[count] + i);
                    save[count+1] = i;
                    dfs(i,count+1,dap + i);
                }
                
            }
        }


    }

    public static boolean isPossible(String c,int a,int b,int count){ 
        for (int i = 0; i <= count; i++) {
            if(save[i] == b)
                return false;
        }                    // 이미 한숫자라면
        if(c.equals("<")){ // 비교하기
            if( b < a)
                return false;
        }
        else{
            if( a < b)
                return false;
        }
        return true;


    }

    


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        k = Integer.parseInt(br.readLine());
        Inequality = br.readLine().split(" ");

        for (int i = 0; i < 10; i++) {
            save[0] = i;
            dfs(i,0,i+"");
        }
        System.out.println(list.get(list.size()-1) + "\n" + list.get(0));

    }
    
    
}