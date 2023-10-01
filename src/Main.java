//Билет № 14
//Необходимо реализовать следующий метод:
//
//        Получаем на входе массив чисел.
//        Все четные числа увеличиваем на единицу.
//        Возвращаем кусок списка с 3-го по 7-й элемент.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int start = 3, end = 7;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] += 1;

            }
            }
        int[] arr2 = Arrays.copyOfRange(arr, start, end + 1);
        System.out.println(Arrays.toString(arr2));

    }

}









