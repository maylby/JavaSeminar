/*
Java: знакомство и как пользоваться базовым API (семинары)
Урок 6. Хранение и обработка данных ч3: множество коллекций Set
https://gb.ru/lessons/414476

00:27:00

HashSet (не сохраняет порядок добавления)
LinkedHashSet (сохраняет порядок добавления)
TreeSet (сортирует


Задание №0
(преподаватель)

 */
package JavaSeminar.Seminar06;

import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * S01CompareSets
 * 
 * 1. Создайте HashSet, заполните его следующими числами: {3, 6, 43, 8, 11, 7, 33, 3, 4, 8}.
 * Распечатайте содержимое данного множества.
 * 2. Создайте LinkedHashSet, заполните его следующими числами: {3, 6, 43, 8, 11, 7, 33, 3, 4, 8}.
 * Распечатайте содержимое данного множества.
 * 3. Создайте TreeSet, заполните его следующими числами: {3, 6, 43, 8, 11, 7, 33, 3, 4, 8}.
 * Распечатайте содержимое данного множества.
 */
public class S01CompareSets {
    public static void main(String[] args) {

        Set<Integer> nashSet = new HashSet<>(Arrays.asList(3, 6, 43, 8, 11, 7, 33, 3, 4, 8));
        Set<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(3, 6, 43, 8, 11, 7, 33, 3, 4, 8));
        Set<Integer> treeSet = new TreeSet<>(Arrays.asList(3, 6, 43, 8, 11, 7, 33, 3, 4, 8));
        
        System.out.println(nashSet);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);    
    }
}


/*
00:35:30

Задание №1

1. Напишите метод, который заполнит массив 
из 1000 элементов случайными цифрами от 0 до 24.

2. Создайте метод, в который передайте заполненный выше массив, 
с помощью Set вычислите процент уникальных значений в данном массиве 
и верните его в виде числа с плавающей запятой.

Для вычисления процента используйте формулу:
процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

*/