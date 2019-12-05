package bruteforce;


import java.io.IOException;
import java.util.Scanner;



public class _1182 {
    static int dap = 0;
    static int count;
    static int hap;
    static int n[] = new int[21];
    static int visited[] = new int[21];

    static void dfs(int depth) {
        if (depth == count) {
            int result = 0;
            for (int i = 0; i < count; i++) {
                if (visited[i] == 1)
                    result += n[i];
            }
            if (!(visited[0] == 0 && visited[1] == 0 && visited[2] == 0 && visited[3] == 0) && result == hap) {
                for (int i = 0; i < count; i++) {
                    if (visited[i] == 1)
                        System.out.print(n[i] + " ");
                }
                System.out.println();
                dap++;
            }
            return;
        }

        visited[depth] = 1;
        dfs(depth + 1);
        visited[depth] = 0;
        dfs(depth + 1);

    }

    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        hap = sc.nextInt();
        for (int i = 0; i < count; i++)
            n[i] = sc.nextInt();

        dfs(0);
        System.out.println(dap);
        sc.close();

    }
}