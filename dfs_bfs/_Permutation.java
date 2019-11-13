package dfs_bfs;

import java.io.IOException;

/*
nPr = n! / (n-r)!
use recursive call


*/

class math_Permutation{

    int Permutation(int n,int r){
        math_factoral mf = new math_factoral();
        return mf.factorial(n)/mf.factorial(n-r);        
    }
  
}

public class _Permutation {
    public static void main(String[] args) throws IOException {
        math_Permutation mp = new math_Permutation();
        System.out.println(mp.Permutation(10,4));
        
    }
    
    
}