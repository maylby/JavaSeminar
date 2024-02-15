/*
Урок 1. Знакомство с языком программирования Java
https://gb.ru/lessons/414471


01:04:30

Задание №2
Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
максимальное количество подряд идущих 1.

 */
package JavaSeminar.Seminar01;

public class S06BinaryNumArray {

 	public static void main(String[] args) {
		int[] array = {1,1,0,1,1,1};
		int count = 0;
		int max = 0;
		for (int el: array) {
			if (el == 1) {
				count++;
				if (count > max) max = count; // v1:
								// если count больше max,
								// в max прередать count

				max = Math.max(count, max); // v2:
								// сравнить count и max,
							  	// большее передать в max

				max = count > max? count : max; // v3:
								// (теренарный оператор)
								// если count больше max,
								// в max прередать count,
								// иначе вернуть max
			} else {
				count = 0; // возвращаем к исходному значению (ноль)
			}
		}

		System.out.print(max);
	}
}
