package GreedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
1
10 8
1 6
2 7
2 5
3 8
3 9
3 7
8 9
9 10

8 1
9 1
2 3
3 4
1 5
2 5
3 5
3 6
*/
public class _9576 {

    public static void main(String args[]) {

        Scanner inputScanner = new Scanner(System.in);
        int TestCase = inputScanner.nextInt();

        for (int Test = 0; Test < TestCase; Test++) {

            boolean beakjoon_had_book[] = new boolean[inputScanner.nextInt() + 1];
            int SeoGangUniversity_Student = inputScanner.nextInt();
            int BookRange_Of_Student[][] = new int[SeoGangUniversity_Student][2];

            for (int man = 0; man < SeoGangUniversity_Student; man++) {
                BookRange_Of_Student[man][0] = inputScanner.nextInt();
                BookRange_Of_Student[man][1] = inputScanner.nextInt();
            }

            Arrays.sort(BookRange_Of_Student, new Comparator<int[]>() {
                public int compare(int[] back, int[] forth) {
                    if (back[1] == forth[1])
                        return back[0] - forth[0];
                    else
                        return back[1] - forth[1];
                }

            });

            
            for (int j = 0; j < BookRange_Of_Student.length; j++) {
                System.out.println(BookRange_Of_Student[j][0]+" "+BookRange_Of_Student[j][1]);
            }

            int beakjoon_distributing = 0;
            for (int i = 0; i < BookRange_Of_Student.length; i++) {
                for (int j = BookRange_Of_Student[i][0]; j <= BookRange_Of_Student[i][1]; j++) {
                    if (!beakjoon_had_book[j]) {
                        beakjoon_had_book[j] = true;
                        beakjoon_distributing++;
                        break;
                    }
                }

                // System.out.println(BookRange_Of_Student[i][0] + " " + BookRange_Of_Student[i][1]);

            }

            // for (int j = 0; j < beakjoon_had_book.length; j++) {
            //     System.out.println(beakjoon_had_book[j]);
            // }

            System.out.println(beakjoon_distributing);

        }

        inputScanner.close();

    }
}