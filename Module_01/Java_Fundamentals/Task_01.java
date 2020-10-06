package com.company.Java_Fundamentals;
/*


        4.     Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.
        5.     Найти количество чисел, содержащих только четные цифры, а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.
        6.     Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.
        7.     Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_01 {
    public static void main(String[] args) throws IOException {

        //1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите длину массива:");
        int sizeArray = Integer.parseInt(reader.readLine());
        int[] array = new int[sizeArray];
        System.out.println("Введите значения массива чисел:");
        for (int i = 0; i < sizeArray; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        String min = Integer.toString(array[0]);
        String max = Integer.toString(array[0]);
        for (int arr : array) {
            String s = Integer.toString(arr);
            if (s.length() >= max.length()) {
                max = s;
            }
            if (s.length() <= min.length()) {
                min = s;
            }
        }
        System.out.println("Самое длинное число: " + max + ". Его длина: " + max.length());
        System.out.println("Самое короткое число: " + min + ". Его длина: " + min.length());

        //2. Вывести числа в порядке возрастания (убывания) значений их длины.

        System.out.println("Вывод чисел в порядке возрастания их длины");
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (Integer.toString(array[j]).length() > Integer.toString(array[j + 1]).length()) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        for (int arr : array) {
            System.out.println(arr);
        }
        //3. Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.

        //вычисляем среднюю длину по всем введенным чыислам:
        double numbersLenght = 0;
        for (int arr : array) {
            numbersLenght += Integer.toString(arr).length();
        }
        double middleLenght = numbersLenght / sizeArray;
        System.out.println("Средняя длина чисел введенного массива: " + middleLenght);
        System.out.print("Выводим числа массива, которые меньше либо равны их средней длине: ");
        for (int arr : array) {
            if (Integer.toString(arr).length() <= (int) middleLenght)
                System.out.print(arr + " ");
        }
        //остальное доделаю завтра...
    }
}
