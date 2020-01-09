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


        for(int k = 0 ; k < number ; k++){ // ���İ��³��
            for(int i = 0 ; i < number ; i++){ // ��߳��
                for(int j = 0 ; j < number ; j++){ // �������
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