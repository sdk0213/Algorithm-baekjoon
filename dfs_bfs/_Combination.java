package dfs_bfs;

import java.io.IOException;

/*
nPr = n! / (n-r)!
use recursive call


*/

class math_Combination{

    int Combination(int n,int r){
        math_factoral mf = new math_factoral();
        math_Permutation mp = new math_Permutation();
        return mp.Permutation(n, r)/mf.factorial(r);
    }
  
}

public class _Combination {
    public static void main(String[] args) throws IOException {
        math_Combination mp = new math_Combination();
        System.out.println(mp.Combination(10,4));
        

    }
    
    
}