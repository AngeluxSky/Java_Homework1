package org.example;
import java.util.Random;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int i = RandomInt(2001); // Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        int n = findHighBiter(i); // Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        int[] m1 = MultiplesN(i, n); // Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        int[] m2 = NoMultiplesN(i, n); // Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

//        System.out.println("i = " + i);
//        System.out.println("n = " + n);
//        System.out.println("m1 = " + Arrays.toString(m1));
//        System.out.println("m2 = " + Arrays.toString(m2));
    }
    public static int RandomInt(int bound) {
        return new Random().nextInt(bound);
    }
    public static int findHighBiter(int n) {
        int result = 0;
        while (n > 0) {
            n /= 2;
            result++;
        }
        return result;
    }

    public static int[] MultiplesN(int start, int n) {
        List<Integer> multiplesNumb = new ArrayList<>();
        for (int i = start; i <= Short.MAX_VALUE; i++) {
            if (i % Math.pow(2, n) == 0) {
                multiplesNumb.add(i);
            }
        }
        return multiplesNumb.stream().mapToInt(i -> i).toArray();
    }
    public static int[] NoMultiplesN(int end, int n) {
        List<Integer> noneMultiplesNumb = new ArrayList<>();
        for (int i = Short.MIN_VALUE; i <= end; i++) {
            if (i % Math.pow(2, n) != 0) {
                noneMultiplesNumb.add(i);
            }
        }
        return noneMultiplesNumb.stream().mapToInt(i -> i).toArray();
    }
}
