package GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1543 {

    static String a[];
    static String n[];

    // static int compare(int k){

    //     int count = 0;
    //     for (int i = k; i < a.length; i++) {
    //         if(a[i].equals(n[count])){
    //             count++;
    //             continue;
    //         }
    //         else
    //             break;
    //     }

    //     if(){
    //         return 999;
    //     }

    //     return 0;
    // }

    
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String document = br.readLine();
        String search = br.readLine();
        
        System.out.println("document : " + document.charAt(0) +" " + document.charAt(1) + " " + document.charAt(2) + " " + document.charAt(3));
        System.out.println("search : " + search);

        String O[] = document.split(search);

        for (int i = 0; i < O.length; i++) {
            System.out.println("O["+i+"] : " + O[i]);
        }

        System.out.println(O.length);

        // a = document.split("");
        // n = search.split("");
        
        // for (int i = 0; i < document.length(); i++) {
        //     compare(i);
        // }

        

    }
}