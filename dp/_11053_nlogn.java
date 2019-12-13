package dp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _11053_nlogn {

    static int n[] = new int[1001]; // 값 받는것
    static List<Integer> list;

    static int lowerbound(int n){
        int s = 0;
        int e = list.size();
        int m;
        while(s<e){
            m = (s+e)/2;
            if(list.get(m) < n) s = m + 1;
            else e = m;
        }
        return e;
    }
    public static void main(String args[]) throws IOException, NumberFormatException {


        list = new ArrayList<Integer>();
        list.add(0);

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            n[i] = sc.nextInt();
        }
        int lb;
        for (int i = 1; i < n.length; i++) {
            lb = lowerbound(n[i]);
            if(list.size() == lb)
                list.add(n[i]);
            else{
                if(list.get(lb) > n[i])
                    list.set(lb,n[i]);
            }    

        }

        System.out.println(list.size() - 1);

        sc.close();
    }
}