package GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*

연결선이 서로 꼬이지(겹치지, 교차하지) 않도록

a -> b 

1 4 3
2 2 2
3 6 3
4 3 3
5 1 4
6 5 1




1) 가장 가까우면서 너무 차이가 크지 않는것 


1 4  +3  4
2 2    0  1      o
3 6  +3  2
4 3   -1  0.75  o
5 1   -4  0.2
6 5   +1 0.82  o

5 1
2 2 o
4 3 o
1 4
6 5 o
3 6


3

1 6 +5  6
2 7 +5  3.5
3 8 +5  2.66
4 4   0  1
5 5   0  1
8 3  -5  0.375    o
7 2  -5  0.28      o
6 1  -5  0.333    o

6 1  o
7 2  o
8 3  o
4 4
5 5
1 6
2 7
3 8

1 3  +2  3
2 1   -1  0.5    o
3 7  +4  2.3
4 4    0  1       o
5 6  +1  1.2     o
6 8  +2  1.3     o 
7 5   -2  0.7
8 2   -7  0.125



2 1 o
8 2 
1 3
4 4 o
7 5 
5 6 o
3 7 
6 8 o

최단 비용으로 가기 위해서는 
O - O - O - O - O



2
1
4
2
3
2
4
6



*/

public class _2352{

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
    
        String[] con = br.readLine().split(" ");
        


    }
}