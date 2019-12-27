package interview;

import java.io.IOException;
import java.util.Random;

public class _marueng {

    
    static StringBuffer sb = new StringBuffer();

    static void BinaryToOctal(int A){ // 2진수 -> Byte ( -128 ~ 127 바꾸기)
        if(A > 127){
            A--;
            A = ~A;

            System.out.println(String.format("%8s", Integer.toBinaryString(A & 0xFF)).replace(' ', '0'));
        }
        System.out.println(String.format("%8s", Integer.toBinaryString(A & 0xFF)).replace(' ', '0'));
        System.out.println(A);
        System.out.println(~A);
        System.out.println(~A + 1);
        System.out.println(String.format("%8s", Integer.toBinaryString((~A+1) & 0xFF)).replace(' ', '0'));
    }

    static void MergeArray_bitByte(byte inArr1[], byte inArr2[] // Arr input
            , int ByteCnt_1, int BitCnt_1, int ByteCnt_2, int BitCnt_2, // input // TotalbyteCnt = 총합 , outArr = 출력
            int TotalbyteCnt, byte outArr[]) throws NumberFormatException  
    { 
        System.out.print("랜덤입력 : Arr1 ByteCnt_1 : " + ByteCnt_1 + ", BitCnt_1 : " + BitCnt_1+ " ,");
        System.out.println("Arr2 ByteCnt_2 : " + ByteCnt_2 + ", BitCnt_2 : " + BitCnt_2);
        for (int i = 0; i < ByteCnt_1; i++)
            sb.append(String.format("%8s", Integer.toBinaryString(inArr1[i] & 0xFF)).replace(' ', '0'));

        String A = String.format("%8s", Integer.toBinaryString(inArr1[ByteCnt_1] & 0xFF)).replace(' ', '0');
        String arr1[] = A.split("");

        String B = String.format("%8s", Integer.toBinaryString(inArr2[ByteCnt_2] & 0xFF)).replace(' ', '0');
        String arr2[] = B.split("");

        if (BitCnt_1 > 0)
            for (int i = 0; i <= BitCnt_1; i++)
                sb.append(arr1[i]);
        if (BitCnt_2 > 0)
            for (int i = BitCnt_2; i < arr2.length; i++)
                sb.append(arr2[i]);

        for (int i = (ByteCnt_2 + 1); i < inArr2.length; i++)
            sb.append(String.format("%8s", Integer.toBinaryString(inArr2[i] & 0xFF)).replace(' ', '0'));

        TotalbyteCnt = sb.length();
        if(TotalbyteCnt % 8 != 0)
        for (int i = 0; i < (8-(TotalbyteCnt % 8)); i++) 
            sb.append("0");
        TotalbyteCnt = sb.length();

        System.out.println("출력어레이 : (TotalbyteCnt : "+TotalbyteCnt+" )");

        for (int i = 0; i < (sb.length() / 8) + 1; i++)
            if ((i * 8) + 8 <= sb.length())
                System.out.print(sb.substring(i * 8, (i * 8) + 8) + " ");

        System.out.println();


        for (int i = 0; i < (sb.length() / 8); i++) 
            if ((i * 8) + 8 <= sb.length()) {
                
                System.out.print(Byte.parseByte(sb.substring(i * 8, (i * 8) + 8), 2)+" ");
                // outArr[i] = Integer.parseInt(sb.substring(i * 8, (i * 8) + 8), 2)+"");
            }
        

    }

    public static void main(String args[]) throws IOException, NumberFormatException {

        Random rd = new Random();

        System.out.println("입력 배열 랜덤입력 (8byte ~ 15byte)");

        int size[] = new int[2];
        size[0] = rd.nextInt(8) + 8;
        size[1] = rd.nextInt(8) + 8;

        byte inArr[][] = new byte[2][];

        inArr[0] = new byte[size[0]];
        inArr[1] = new byte[size[1]];

        for (int i = 0; i < 2; i++) {
            System.out.print("입력 배열 " + (i + 1) + " (" + size[i] + "byte)" + " :\n");
            for (int j = 0; j < size[i]; j++) {
                inArr[i][j] = Byte.parseByte((rd.nextInt(256) - 128) + "");
                // System.out.print(inArr[i][j] + " ");
            }
            for (int j2 = 0; j2 < size[i]; j2++) {
                System.out.print(String.format("%8s", Integer.toBinaryString(inArr[i][j2] & 0xFF)).replace(' ', '0') + " ");
                // 1,2의보수 계산하여 2진수 변환하는것이 시간이 오래걸릴것같아서
                // https://stackoverflow.com/questions/12310017/how-to-convert-a-byte-to-its-binary-string-representation
                // 참고하였습니다.
            }
            System.out.println();
        }

        byte outArr[] = new byte[size[0] + size[1]];

        MergeArray_bitByte(inArr[0], inArr[1], rd.nextInt(inArr[0].length) + 0, rd.nextInt(8) + 0,
                rd.nextInt(inArr[1].length) + 0, rd.nextInt(8) + 0, 0, outArr);

    }
}