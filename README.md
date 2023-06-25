# Java_Homework1

Первый семинар.
1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

Пункты реализовать в методе main
*Пункты реализовать в разных методах

int i = new Random().nextInt(k); //это кидалка случайных чисел!)

Пакет для реализации new Random() - import java.util.Random;
Полный импортируемый пакет - import java.util.*;

Строка  преобразовывает return name.stream().mapToInt(i -> i).toArray(); (некоторое количество целых чисел) в массив целых чисел и возвращает этот массив.
То есть:

- метод stream() создает поток элементов указанной коллекции.
- метод mapToInt(i -> i) преобразовывает каждый элемент потока (а точнее числа из указанной коллекции) в тип int.
- метод toArray() конвертирует поток элементов в массив целых чисел.
