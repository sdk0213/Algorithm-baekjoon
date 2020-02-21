package GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _2812 {

    public static void main(String args[]) throws IOException {

        BufferedReader Input_Buffer = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter Output_Buffer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st_token = new StringTokenizer(Input_Buffer.readLine(), " ");
        int Number_length = Integer.parseInt(st_token.nextToken());
        int Delete_num = Integer.parseInt(st_token.nextToken());

        String digit = Input_Buffer.readLine();
        char stack_digit[] = new char[Number_length - Delete_num];
        int stack_top = 0;

        for (int i = 0; i < Number_length; i++) {

            if(stack_top == Number_length - Delete_num) break;

            while (stack_top > 0 && Delete_num > 0 && stack_digit[stack_top - 1] < digit.charAt(i)) {
                stack_top--;
                Delete_num--;
            }

            stack_digit[stack_top++] = digit.charAt(i);

        }

        for (int i = 0; i < stack_digit.length ; i++) 
            Output_Buffer.write(stack_digit[i]);

        Output_Buffer.flush();
        Input_Buffer.close();
        Output_Buffer.close();

    }
}