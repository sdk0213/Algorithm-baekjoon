package GreedyAlgorithm;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

import com.oracle.webservices.internal.api.EnvelopeStyle;

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