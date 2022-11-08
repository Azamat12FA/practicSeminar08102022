import Task1.CounterCharInString;
import Task4.MyGenerate15;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
//        CounterCharInString.main(args);
//        MyGenerate15.main(args);
        System.out.println("Введите число: ");
        System.out.println(getMaxDigit(getInt()));
    }

    public static int getInt() {
        int res;
        if (input.hasNextInt()) {
            res = input.nextInt();
        } else {
            System.out.println("Введите пожалуйста число");
            input.next();
            res = getInt();
        }
        return res;
    }

//    Домашнее задание
//    Напишите метод, который принимает в качестве параметра целое число и возвращает самую большую цифру в этом числе.
    public static int getMaxDigit (int num) {
        int max = 0;
        while (num != 0) {
            if (num % 10 > max) {
                max = num % 10;
            }
            num = num / 10;
        }
        return max;
    }

}