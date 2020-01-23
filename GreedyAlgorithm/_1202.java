package GreedyAlgorithm;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

import com.oracle.webservices.internal.api.EnvelopeStyle;

/*
        // jewelry[][] 를 오름차순으로 정렬(1.무게 2.가격)
        // bag[i] 를 오름차순으로 정렬
        // while(){
        //    bag[i] 오름차순 정렬순서대로 jewelry[][] 해당 무게에 가장 높은 가격을 검색후 bag[i]에다가 넣고(넣었다고 치고) 삭제
        //  }
        // 검색할때는 bag[i] 보다 작은것들을 전부 검색해야하고 그중에서 가장 값어치 있는것을 넣어야함
        // 5의 공간의 가방에 들어갈 쥬얼리를 찾을때는 1,2,3,4,5 중(정렬되어있음) 에 가장 가치가 높은것을 찾으면됨
*/



class Jewel_Info implements Comparable<Jewel_Info>{
    int Jewel_Info_Weight;
    int Jewel_Info_Price;

    public Jewel_Info(int Jewel_Info_Weight,int Jewel_Info_Price){
        this.Jewel_Info_Weight = Jewel_Info_Weight;
        this.Jewel_Info_Price = Jewel_Info_Price;
    }
    public int compareTo(Jewel_Info ObjforCompare) {
        if(this.Jewel_Info_Weight == ObjforCompare.Jewel_Info_Weight)
            if(this.Jewel_Info_Price < ObjforCompare.Jewel_Info_Price)
                return 1;
            else    
                return -1;
        else
            if(this.Jewel_Info_Weight > ObjforCompare.Jewel_Info_Weight)
                return 1;
            else
                return -1;
    }
}
public class _1202{

    public static void main(String args[]){


        Scanner inputScanner = new Scanner(System.in);
        int Jeweler_had_Jewel = inputScanner.nextInt();
        int SangDuk_had_Bag = inputScanner.nextInt();
        int SangDuk_had_Bag_Info[] = new int[SangDuk_had_Bag];
        PriorityQueue<Jewel_Info> priorityQueue = new PriorityQueue<Jewel_Info>();

        for (int i = 0; i < Jeweler_had_Jewel; i++)
            priorityQueue.offer(new Jewel_Info(inputScanner.nextInt(), inputScanner.nextInt()));
        for (int i = 0; i < SangDuk_had_Bag; i++)
            SangDuk_had_Bag_Info[i] = inputScanner.nextInt();

        Arrays.sort(SangDuk_had_Bag_Info);
        
         while(!priorityQueue.isEmpty()){
            Jewel_Info jewel_Info = priorityQueue.poll();
            System.out.println(jewel_Info.Jewel_Info_Weight +" "+ jewel_Info.Jewel_Info_Price);
        }

        for (int i = 0; i < SangDuk_had_Bag; i++) {
                        
        }

        inputScanner.close();


        
        

    }
}