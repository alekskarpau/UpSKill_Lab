package com.company.Java_Fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main_Task {
    public static void main(String[] args) throws IOException {

        //1. Приветствовать любого пользователя при вводе его имени через командную строку.

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Пожалуйста, введите свое имя: ");
        String name = reader.readLine();
        System.out.println("Приветствую тебя, " + name + "!");


        //2. Отобразить в окне консоли аргументы командной строки в обратном порядке.

        ArrayList<String> listNumbers = new ArrayList<>();
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите последовательность символов либо чисел: ");
        System.out.println("(Для выхода из ввода нажмите Enter)");
        while (true){
            String s = reader1.readLine();
            if (s.equals("")) {
                System.out.println("Вы ввели пустую строку. Ввод окончен.");
                break;
            }
            listNumbers.add(s);
        }
        System.out.println("Последовательность символов и чисел в обратном порядке: ");
        for (int i = listNumbers.size() - 1; i >= 0 ; i--) {
            System.out.print(listNumbers.get(i) + " ");
        }
        System.out.println("");

        //3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите числа:");
        System.out.println("(Для выхода из ввода нажмите Enter)");
        try{
        while (true) {
                String s = reader2.readLine();
                list.add(Integer.parseInt(s));
                }
            }catch (NumberFormatException e){
                System.err.println("Вы ввели пустую строку. Ввод чисел окончен");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println("");
        }

//        4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.

        ArrayList<Integer> listNumbers1 = new ArrayList<>();
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите числа для подсчета их суммы и произведения:");
        System.out.println("(Для выхода из ввода нажмите Enter)");
        try {
            while (true) {
                String s = reader3.readLine();
                listNumbers1.add(Integer.parseInt(s));
                }
            }catch (NumberFormatException e){
                System.err.println("Вы ввели пустую строку. Ввод чисел окончен");
        }
        int sum = 0;
        for (int i = 0; i < listNumbers1.size(); i++) {
            sum += listNumbers1.get(i);
        }
        System.out.println("Сумма введенных чисел равна: " + sum);

        int multiplication = 1;
        for (int i = 0; i < listNumbers1.size(); i++) {
            multiplication *= listNumbers1.get(i);
        }
        System.out.println("Произведение введенных чисел равно: " + multiplication);

//        5. Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.

        BufferedReader reader4 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число от 1 до 12");
        try {
        int mounthNumber = Integer.parseInt(reader4.readLine());
        if (mounthNumber >= 1 && mounthNumber <= 12){
                switch (mounthNumber){
                    case 1:
                        System.out.println("Январь");
                        break;
                    case 2:
                        System.out.println("Февраль");
                        break;
                    case 3:
                        System.out.println("Март");
                        break;
                    case 4:
                        System.out.println("Апрель");
                        break;
                    case 5:
                        System.out.println("Май");
                        break;
                    case 6:
                        System.out.println("Июнь");
                        break;
                    case 7:
                        System.out.println("Июль");
                        break;
                    case 8:
                        System.out.println("Август");
                        break;
                    case 9:
                        System.out.println("Сентябрь");
                        break;
                    case 10:
                        System.out.println("Октябрь");
                        break;
                    case 11:
                        System.out.println("Ноябрь");
                        break;
                    case 12:
                        System.out.println("Декабрь");
                        break;
                    }
                }
            }catch (NumberFormatException e){
                System.err.println("Вы ввели неверный формат числа от 1 до 12");
        }
    }
}
