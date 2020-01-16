package GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1543 {

    static char a[];
    static char n[];

    static int compare(int k){

        int count = 0;
        for (int i = k; i < a.length; i++) {
            if(a[i]==n[count]){
                count++;
                if(count==n.length){
                    
                    return i;

                }
                continue;
            }
            else
                break;
        }
        return -1;
    }

    
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String document = br.readLine();
        String search = br.readLine();

        a = document.toCharArray();
        n = search.toCharArray();

        int c;
        int num=0;
        for (int i = 0; i < a.length ; i++) {
            
            if((c = compare(i))!=-1){
                i = c;
                num++;
            }
                
        }

        System.out.println(num);
        

    }
}