import java.util.Arrays;
import java.util.Scanner;

public class Method04 {


    public static int[] input()
    {
        Scanner scan = new Scanner(System.in);

        int arrayInt[];
        arrayInt = new int[10];

        System.out.print("정수 10개 입력>>");

        for (int i=0; i<arrayInt.length; i++)
        {
            arrayInt[i]=scan.nextInt();
        }

        return arrayInt;
    }

    public static void print(int arrayInt[])
    {for (int i=0; i<arrayInt.length; i++)
    {
        System.out.print(arrayInt[i] + " ");
    }
    }

    public static void main(String [] args){

//        Scanner scan = new Scanner(System.in);
//
//        int arrayInt[];
//        arrayInt = new int[10];
//
//        System.out.print("정수 10개 입력>>");
//
//        for (int i=0; i<arrayInt.length; i++)
//        {
//            arrayInt[i]=scan.nextInt();
//        }
//            Arrays.sort(arrayInt);
//        System.out.print(Arrays.toString(arrayInt));

//        -------------------------------------------------
        int arrayInt[] = new int[10];
        arrayInt = input();
        Arrays.sort(arrayInt);
        print(arrayInt);

//        이중 반복문으로 순서 정렬
        for (int i=0; i < arrayInt.length; i++)
            for (int j = i; j < arrayInt.length; j++)
                if (arrayInt[i] > arrayInt[j])
                {
                    int tmp = arrayInt[i];
                    arrayInt[i] = arrayInt[j];
                    arrayInt[j] = tmp;
                }
    }
}
