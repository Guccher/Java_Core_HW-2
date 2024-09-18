//Написать функцию, возвращающую разницу между самым большим и
//самым маленьким элементами переданного
//не пустого массива.

import java.util.Arrays;
import java.util.Random;
import java.util.Collections;

public class Task2 {

    public static void main(String[] args) {

        Random rand = new Random();                                         // Инициализация переменной rand
        int numbers_difference = 0;                                         // переменной numbers_difference
        Integer[] arr = new Integer[10];                                    // массива
        int result_difference = arrayMinMax(arr, numbers_difference, rand); // присвоение переменной result_difference
                                                                            // то что вернулось в метод arrayMinMax


        System.out.println("Difference between max and min = " + result_difference); // Вывод результата разницы
        System.out.println(Arrays.toString(arr));                                 // вывод заполненного непустого массива
    }


    public static int arrayMinMax (Integer[] arr, int numbers_difference, Random rand) { // создание метода и передача
                                                                                            // в него аргументов

        for (int i = 0; i < arr.length; i++) {                                  // цикл заполенния массива
            arr[i] = rand.nextInt(20);                                   // рандомными значениями

            }
        int min = (int) Collections.min(Arrays.asList(arr));                   // инициализация переменной min
        int max = (int) Collections.max(Arrays.asList(arr));                   // инициализация переменной max
        numbers_difference = max - min;                                        // запись результата разницы min и max
        System.out.println("Min number =  " + min + "; Max number =  " + max); // вывод на экран min и max
        return numbers_difference;                                             // возвращение разницы в метод
        }


    }



