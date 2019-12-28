package interview;

import java.io.IOException;
import java.util.Random;

public class _marueng {

    
    static StringBuffer sb = new StringBuffer();

    static byte BinaryToOctal(int A){ // 10���� -> ����ǥ�������� Byte�� ��ȯ
        if(A > 127){
            A = A - 128;
            A = -128 + A;
            return (byte)A;
        }
        else{
            return (byte)A;
        }
    }

    static void MergeArray_bitByte(byte inArr1[], byte inArr2[] // Arr input
            , int ByteCnt_1, int BitCnt_1, int ByteCnt_2, int BitCnt_2, // input // TotalbyteCnt = ���� , outArr = ���
            int TotalbyteCnt, byte outArr[]) throws NumberFormatException  
    { 
        for (int i = 0; i < ByteCnt_1; i++)
            sb.append(String.format("%8s", Integer.toBinaryString(inArr1[i] & 0xFF)).replace(' ', '0')); // inArr1 �պκ� byte������ ������

        String A = String.format("%8s", Integer.toBinaryString(inArr1[ByteCnt_1] & 0xFF)).replace(' ', '0'); //bit������ ������
        String arr1[] = A.split("");

        String B = String.format("%8s", Integer.toBinaryString(inArr2[ByteCnt_2] & 0xFF)).replace(' ', '0'); //bit������ ������
        String arr2[] = B.split("");

        if (BitCnt_1 > 0)
            for (int i = 0; i <= BitCnt_1; i++) 
                sb.append(arr1[i]);
        if (BitCnt_2 > 0)
            for (int i = BitCnt_2; i < arr2.length; i++) // bit�� ����� ��ģ���� byte�� �Ѿ��� byte�ϳ� �� �����
                sb.append(arr2[i]);

        for (int i = (ByteCnt_2 + 1); i < inArr2.length; i++) // inArr2 �޺κ� byte������ ������
            sb.append(String.format("%8s", Integer.toBinaryString(inArr2[i] & 0xFF)).replace(' ', '0'));

        TotalbyteCnt = sb.length(); // 0�������� 8�ڸ� ä���

        if(TotalbyteCnt % 8 != 0)
        for (int i = 0; i < (8-(TotalbyteCnt % 8)); i++) 
            sb.append("0");
        TotalbyteCnt =  sb.length()/8; // �� byte �Է�
        System.out.println("TotalByteCnt : " + TotalbyteCnt);

        for (int i = 0; i < (sb.length() / 8); i++)  
            if ((i * 8) + 8 <= sb.length()) {
                outArr[i] = BinaryToOctal(Integer.parseInt(sb.substring(i * 8, (i * 8) + 8), 2)); // 8�ڸ��� ��� 10������ ��ȯ�� BinrayToOctal�Լ�
            }
        System.out.print("outArr[] :\n");  
        for (int i = 0; i < outArr.length; i++) 
            System.out.print(outArr[i]+" ");
        System.out.println();
        for (int i = 0; i < outArr.length; i++) {
            System.out.print(String.format("%8s", Integer.toBinaryString(outArr[i] & 0xFF)).replace(' ', '0')+" ");
        }
        

    }

    public static void main(String args[]) throws IOException, NumberFormatException {


        Random rd = new Random();

        System.out.println("\n�Է� �迭 �����Է� (4byte ~ 8byte)");

        int size[] = new int[2];
        size[0] = rd.nextInt(5) + 4;
        size[1] = rd.nextInt(5) + 4;

        byte inArr[][] = new byte[2][];

        inArr[0] = new byte[size[0]];
        inArr[1] = new byte[size[1]];

        for (int i = 0; i < 2; i++) {
            System.out.print("\n�Է� �迭 " + (i + 1) + " (" + size[i] + "byte)" + " :\n");
            for (int j = 0; j < size[i]; j++) {
                inArr[i][j] = Byte.parseByte((rd.nextInt(256) - 128) + "");
                System.out.print(inArr[i][j] + " ");
            }
            System.out.println();
            for (int j2 = 0; j2 < size[i]; j2++) {
                System.out.print(String.format("%8s", Integer.toBinaryString(inArr[i][j2] & 0xFF)).replace(' ', '0') + " ");
                // 1,2�Ǻ��� ����Ͽ� 2���� ��ȯ�ϴ°��� �ð��� �����ɸ��Ͱ��Ƽ�
                // https://stackoverflow.com/questions/12310017/how-to-convert-a-byte-to-its-binary-string-representation
                // �����Ͽ����ϴ�.
            }
            System.out.println();
        }

        int ByteCnt_1 = rd.nextInt(inArr[0].length) + 0; // ���� ���� �Է�
        int BitCnt_1 = rd.nextInt(8) + 0;
        int ByteCnt_2 = rd.nextInt(inArr[1].length) + 0;
        int BitCnt_2 = rd.nextInt(8) + 0;
        int make = (ByteCnt_1) + (size[1] - ByteCnt_2); // outArr �迭 �ʿ��Ѹ�ŭ ����
        if ( ( BitCnt_1 + 1) + (7 - BitCnt_2 + 1) > 8) make++;
        byte outArr[] = new byte[make];
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Random Input : " + ByteCnt_1 + " " + BitCnt_1+ " " + ByteCnt_2 + " " + BitCnt_2+" (ByteCnt1,BitCnt1,ByteCnt2,BitCnt2)");
        System.out.println("---------------------------------------------------------------------------------");
        MergeArray_bitByte(inArr[0], inArr[1], ByteCnt_1, BitCnt_1 ,ByteCnt_2, BitCnt_2 , 0, outArr);

    }
}