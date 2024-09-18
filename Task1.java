//Написать метод, возвращающий количество чётных элементов массива.
//countEvens([2, 1, 2, 3, 4]) → 3
//countEvens([2, 2, 0]) → 3
//countEvens([1, 3, 5]) → 0


import java.util.Arrays;
import java.util.Random;

public class Task1 {

    public static void main(String[] args) {


        Random rand = new Random();

        int[] arr = new int[10];                                                // инициализация массива
        int count = 0;                                                          //  и переменных
        int count_even = countEvenNumbers(arr, count, rand);

        System.out.println(Arrays.toString(arr) + " -> " + count_even);         // вывод рандомного массива и
                                                                                // количесва чётных чисел в нём

    }


    public static int countEvenNumbers(int[] arr, int count, Random rand) {     // создание метода возращающего
                                                                                // количество чётных элементов

        for (int i = 0; i < arr.length; i++) {                                  // цикл с условным оператором на проверку чётности
                                                                                // элемента по индексу массива
            arr[i] = rand.nextInt(20);
            if (arr[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }


}
