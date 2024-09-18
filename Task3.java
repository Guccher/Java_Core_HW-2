//Написать функцию, возвращающую истину,
//если в переданном массиве есть два соседних элемента,
//с нулевым значением.

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);          // Инициализация переменной scanner
        System.out.print("Введите длину массива: ");      // вывод строки с длиной массива
        int length = scanner.nextInt();                  // Инициализация переменной length и ввод с её с клавиатуры
        int[] arr = new int[length];
        System.out.println("Введите элементы массива:");          // вывод строки с элекментами массива
        boolean result_truth = returnTrueFalse(arr, length, scanner);  // присвоение переменной метода с аргументами


        System.out.println(Arrays.toString(arr));    // вывод заполненного непустого массива
        System.out.println(result_truth);            // вывод переменной с результатом метода

    }

    public static boolean returnTrueFalse(int[] arr, int length, Scanner scanner) {  // объявление метода с аргументами

        for (int i = 0; i < length; i++) {          // цикл с заполнением массива с клавитуры
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < length - 1; i++) {      // цикл нахождение двух соседних значений равных нулю
            if (arr[i] == 0 && arr[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }

}




