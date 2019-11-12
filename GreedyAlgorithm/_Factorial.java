package GreedyAlgorithm;

import java.io.IOException;


class math_factoral{

    int factorial(int i){

        if(i == 1)
            return 1;
        return i*factorial(i-1);
    }
  
}



public class _Factorial {
    public static void main(String[] args) throws IOException {
        math_factoral mf = new math_factoral();
        System.out.println(mf.factorial(10));

    }
    
    
}