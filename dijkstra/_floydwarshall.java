package dijkstra;

public class _floydwarshall{
    static int number = 4;
    static int INF = 100000000;

    static int a[][] = new int[][]{
        {0,5,INF,8},
        {7,0,9,INF},
        {2,INF,0,4},
        {INF,INF,3,0}
    };

    static void floydwarshall(){

        int d[][] = new int[number][number];

        for(int i = 0 ; i < number ; i++){
            for(int j = 0 ; j < number ; j++){
                d[i][j] = a[i][j];
            }
        }


        for(int k = 0 ; k < number ; k++){ // 거쳐가는노드
            for(int i = 0 ; i < number ; i++){ // 출발노드
                for(int j = 0 ; j < number ; j++){ // 도착노드
                    if(d[i][k] + d[k][j] < d[i][j])
                        d[i][j] = d[i][k] + d[k][j]; 
                }
            }
        }


        for(int i = 0 ; i < number ; i++){
            for(int j = 0 ; j < number ; j++){
                System.out.print(d[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        floydwarshall();
    }
}