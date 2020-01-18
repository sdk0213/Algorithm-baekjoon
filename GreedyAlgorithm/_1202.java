package GreedyAlgorithm;

import java.util.Scanner;

/*
1. 주어진 보석을 무게를 기준으로 정렬한다. 그리고 가격을 기준으로 정렬한다.
2. 입력받은 가방을 오름차순으로 정렬한다.
3. 무게가 가장낮은것부터 계산하여서 가방에 들어가는 보석중 가장 가치있는것부터 가방에 집어넣는다.
4. 가방 무게가 낮은것부터 하는 이유는 높은것부터 할경우 가장 작은가방에 들어가도 될 보석을 큰가방에 집어넣음으로써 실패할수있기 때문이다.
*/
public class _1202{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int jewelry_Num = sc.nextInt();
        int bag_Num = sc.nextInt();
        int jewelry[][] = new int[jewelry_Num][2];
        int bag[] = new int[bag_Num];

        for (int i = 0; i < jewelry_Num; i++) {
            jewelry[i][0] = sc.nextInt();
            jewelry[i][1] = sc.nextInt();
        }

        for (int i = 0; i < bag_Num; i++) 
            bag[i] = sc.nextInt();
        
        // jewelry[][] 를 오름차순으로 정렬(1.무게 2.가격)
        // bag[i] 를 오름차순으로 정렬
        // while(){
        //    bag[i] 오름차순 정렬순서대로 jewelry[][] 해당 무게에 가장 높은 가격을 검색후 bag[i]에다가 넣고(넣었다고 치고) 삭제
        //  }
        // 검색할때는 bag[i] 보다 작은것들을 전부 검색해야하고 그중에서 가장 값어치 있는것을 넣어야함
        // 5의 공간의 가방에 들어갈 쥬얼리를 찾을때는 1,2,3,4,5 중(정렬되어있음) 에 가장 가치가 높은것을 찾으면됨
        //  
        


    
        sc.close();


        
        

    }
}