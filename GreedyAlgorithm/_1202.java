package GreedyAlgorithm;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;


/*
        // jewelry[][] �� ������������ ����(1.���� 2.����)
        // bag[i] �� ������������ ����
        // while(){
        //    bag[i] �������� ���ļ������ jewelry[][] �ش� ���Կ� ���� ���� ������ �˻��� bag[i]���ٰ� �ְ�(�־��ٰ� ġ��) ����
        //  }
        // �˻��Ҷ��� bag[i] ���� �����͵��� ���� �˻��ؾ��ϰ� ���߿��� ���� ����ġ �ִ°��� �־����
        // 5�� ������ ���濡 �� ��󸮸� ã������ 1,2,3,4,5 ��(���ĵǾ�����) �� ���� ��ġ�� �������� ã�����
*/



class Jewel_Info implements Comparable<Jewel_Info>{
    int Jewel_Info_Weight;
    int Jewel_Info_Price;

    public Jewel_Info(int Jewel_Info_Weight,int Jewel_Info_Price){
        this.Jewel_Info_Weight = Jewel_Info_Weight;
        this.Jewel_Info_Price = Jewel_Info_Price;
    }
    public int compareTo(Jewel_Info ObjforCompare) {
        return this.Jewel_Info_Weight - ObjforCompare.Jewel_Info_Weight;
    }
}
public class _1202{

    public static void main(String args[]){


        Scanner inputScanner = new Scanner(System.in);
        int Jeweler_had_Jewel = inputScanner.nextInt();
        int SangDuk_had_Bag = inputScanner.nextInt();
        Jewel_Info jewel_Info[] = new Jewel_Info[Jeweler_had_Jewel];
        int SangDuk_had_Bag_Info[] = new int[SangDuk_had_Bag];
        Queue<Integer> priorityQueue = new PriorityQueue<Integer>();


        for (int i = 0; i < Jeweler_had_Jewel; i++)
            jewel_Info[i] = new Jewel_Info(inputScanner.nextInt(), inputScanner.nextInt());
        for (int i = 0; i < SangDuk_had_Bag; i++)
            SangDuk_had_Bag_Info[i] = inputScanner.nextInt();
        Arrays.sort(jewel_Info);
        Arrays.sort(SangDuk_had_Bag_Info);
        
        long SangDuk_Get_Money = 0;
        int j = 0;
        for (int Putin = 0; Putin < SangDuk_had_Bag; Putin++) {
            
            while( (j < Jeweler_had_Jewel)  && (jewel_Info[j].Jewel_Info_Weight <= SangDuk_had_Bag_Info[Putin]) ){
                priorityQueue.add(jewel_Info[j].Jewel_Info_Price);
                j++;
            }
            if(!priorityQueue.isEmpty()){
                SangDuk_Get_Money += Math.abs(priorityQueue.poll());
            }
        }

        System.out.println(SangDuk_Get_Money);
    

        inputScanner.close();


    }
}
