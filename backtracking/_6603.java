package backtracking;


import java.util.Scanner;

public class _6603 {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int number[] = new int[13];
    static int count;
    static StringBuffer bf = new StringBuffer();
    public static void dfs(int a,String str){

        if(count == 6){
            bf.append(str+"\n"); // 6개가 채워지면은 bf에다가 넣고 엔터
        }
        else{
            for (int i = a + 1; i < n; i++) { // 1 - 2 - 3 - 4 - 5 - 6 - 7 (오름차순으로 되어있기 떄문에) a+1부터 n까지
                count++;
                dfs(i,str+number[i]+" ");  // 다음꺼에 넘겨주기
            }
        }
    
        count--;    // 끝나면 지금까지 더해졌던 count를 --해야지 그전에서 실행됨

    }
    public static void main(String args[]){

        while((n = sc.nextInt()) != 0){
        
            for (int j = 0; j < n; j++) {
                number[j] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) { // 1-2-3-4-... 백트래킹
                count=1;                  // 2-3-4-5-... 백트래킹
                dfs(i,number[i]+" ");     // 3-4-5-6.... 백트래킹
            }
            bf.append("\n");

        }
        System.out.println(bf.toString());

    }

}
