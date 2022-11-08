package Task4;

import java.util.Arrays;

public class MyGenerate15 {
    public static void main(String[] args) {
        int[] array = generate15Numbers(-25, 25);
        System.out.println(Arrays.toString(array));
        System.out.printf("Количество положительный чисел: %s\n" +
                "Количество четных чисел: %s\n" +
                "Количество однозначных чисел: %s\n",
                numberOfPositive(array), numberOfEvenNumbers(array), numberOfSingleDigits(array));
    }

    public static int[] generate15Numbers(int min, int max) {
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = min + (int) (Math.random() * ((max - min) + 1));
        }
        return arr;
    }

    public static int numberOfPositive(int[] arr) {
        int res = 0;
        for (int i : arr) {
            if (i > 0) {
                res++;
            }
        }
        return res;
    }

    public static int numberOfEvenNumbers(int[] arr) {
        int res = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                res++;
            }
        }
        return res;
    }

    public static int numberOfSingleDigits(int[] arr) {
        int res = 0;
        for (int i : arr) {
            if (i < 10 && i > -10) {
                res++;
            }
        }
        return res;
    }

}
