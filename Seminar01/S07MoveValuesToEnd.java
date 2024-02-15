/*
Урок 1. Знакомство с языком программирования Java
https://gb.ru/lessons/414471

01:23:30
Задание №3

Дан массив nums = [3,2,2,3] и число val = 3.
Если в массиве есть числа, равные заданному, нужно перенести
эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов массива
должны быть отличны от заданного, а остальные - равны ему.


01:25:00
Решение

 */
package JavaSeminar.Seminar01;

import java.util.Arrays;

public class S07MoveValuesToEnd {
    public static void main(String[] args) {
		int[] arr = {3,2,2,3};
		int val = 3;
		int rightIndex = arr.length - 1; // правый индекс равен 
                                         // длине массива минус один
                                         // (последний элемент массива)
		int leftIndex = 0;  // левый индекс равен нулю 
                            // (первый элемент массива)
		while (arr[rightIndex] == val) { // Пока значение правого индекса
                                         // равно значению "val" (= 3),
			rightIndex--; // правый индекс уменьшаем на единицу
		}
		while (leftIndex < rightIndex) { // Пока левый индексе меньше правого,
			if (arr[leftIndex] == val) { // если левое значение равно "val", то
				arr[leftIndex] = arr[rightIndex]; // передаём левому элементу
                                                  // значение правого,
				arr[rightIndex] = val; // а правому пердаём занчение "val" (= 3).
				rightIndex--; // правый индекс уменьшаем на единицу
			}
			leftIndex++; // левый индекс увеличиваем на единицу
		}
		System.out.println(Arrays.toString(arr));
	}
}
