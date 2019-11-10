package GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


/*

Day Of Mourning의 기타리스트 강토가 사용하는 기타에서 N개의 줄이 끊어졌다. 
따라서 새로운 줄을 사거나 교체해야 한다. 강토는 되도록이면 돈을 적게 쓰려고 한다. 
6줄 패키지를 살 수도 있고, 1개 또는 그 이상의 줄을 낱개로 살 수도 있다.

끊어진 기타줄의 개수 N과 기타줄 브랜드 M개가 주어지고, 
각각의 브랜드에서 파는 기타줄 6개가 들어있는 패키지의 가격, 낱개로 살 때의 가격이 주어질 때,
적어도 N개를 사기 위해 필요한 돈의 수를 최소로 하는 프로그램을 작성하시오.

입력
첫째 줄에 N과 M이 주어진다. N은 100보다 작거나 같은 자연수이고, M은 50보다 작거나 같은 자연수이다. 둘째 줄부터 M개의 줄에는 각 브랜드의 패키지 가격과 낱개의 가격이 공백으로 구분하여 주어진다. 가격은 0보다 크거나 같고, 1,000보다 작거나 같은 정수이다.

4 6   줄부터 
12 3 (5)
15 4 (4)
11 2 (6)
19 5 (4)
13 4 (4)
20 7 (3)

1. 오름차순으로 정렬하고
2. x 줄 한것보다 작으면 그거사고
3. x 줄 한것보다 

오름차순으로 정렬후 가장 작은값을 min에다가 넣기

11 2(x 줄) 8 
12 3       12
13 4       16
15 4       16
19 2       8
20 4       16

N개를 구매할때 최소한의 가치로 구매를 위해서는

일단 묶음이 낱개보다 싸다고 생각해보면 모르겠다. 아닐수도 있다. 낱개로 사는게 더쌀수도있다.
6줄 이상일경우에는 묶음으로 사는게 가장 이득인가? 모른다.

6줄이상일때와 6줄 이하 일때와 상관없이
패키지의 낱개가격 /= 6
으로 가장 싼값에 사는경우를 오름차순으로 정리한후에

6줄 이상일경우에는 패키지가 싼지 낱개가 싼지 게산할필요가있는데
가장 싼값으로 오름차순을 하면되지만 그것이 패키지인지 아닌지의 유무를 구분할 무언가가 필요함
패키지 낱개 따로 분리하여서 계산후에
오름차순으로 정리한다음에 패키지랑 낱개 따로 하여서 계산하고 그중에 싼걸로 N/6개만큼 구매하고
나머지 N%6 은 낱개로 구매하기


*/

/*

6줄 이상일경우에는 패키지가 싼지 낱개가 싼지 게산할필요가있는데
가장 싼값으로 오름차순을 하면되지만 그것이 패키지인지 아닌지의 유무를 구분할 무언가가 필요함
패키지 낱개 따로 분리하여서 계산후에
오름차순으로 정리한다음에 패키지랑 낱개 따로 하여서 계산하고 그중에 싼걸로 N/6개만큼 구매하고
나머지 N%6 은 낱개로 구매하기


*/
public class _1049 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int cutoff = Integer.parseInt(input[0]);
        int brand = Integer.parseInt(input[1]);
        int pkg[] = new int[brand];
        int col[] = new int[brand];
        int cut;
        if(cutoff < 6 )
            cut = cutoff;   
        else
            cut = 6;
        for (int i = 0; i < brand; i++) { 
            input = br.readLine().split(" "); 
            pkg[i] = Integer.parseInt(input[0]);
            col[i] = Integer.parseInt(input[1])*cut;   
        }
        Arrays.sort(pkg);
        Arrays.sort(col);
        if(pkg[0] > col[0]){ // 낱개가 더쌀경우
            System.out.println("낱개 : " + cutoff*(col[0]/cut));
        }
        else{ // 패키지가 더 쌀경우 
            if(cut < 6)
                System.out.println(pkg[0]);
            else{ 
                int a;
                a = pkg[0]*(int)(cutoff/cut);
                if(col[0]/cut*(cutoff % 6)  < pkg[0]) // 패키지가 더 싸고 그 나머지를 구입할경우에도 낱개가 더 유리한경우
                    a += (col[0]/cut)*(cutoff % 6);
                else                                                                // 왜냐하면 위조건과 상관없이 작동해야하기 때문에
                    a += pkg[0];
                System.out.println(a);
            }
        }
        // 6개 이하이고 패키지가 더쌀경우 패키지를 구매하면됨
        // 6개 이상이고 패키지가 더쌀경우 cutoff/6 로 나누고 6개 이하여도 여기서 작동하게 할려면

    }
}