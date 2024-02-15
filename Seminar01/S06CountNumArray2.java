/*
Урок 1. Знакомство с языком программирования Java
https://gb.ru/lessons/414471


01:04:30

Задание №2
Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
максимальное количество подряд идущих 1.

 */
package JavaSeminar.Seminar01;

public class S06CountNumArray2 {

 	public static void main(String[] args) {
		int[] array = {1,1,0,1,1,1};
		int max = getMaxCountOnes(array);
		System.out.print(max);
	}

    private static int getMaxCountOnes(int[] array) {
        int count = 0;
		int max = 0;
		for (int el: array) {
			if (el == 1) {
				count++;
				// if (count > max) max = count; // v1
				// max = Math.max(count, max);   // v2
				max = count > max? count : max;  // v3 (теренарный оператор)

			} else {
				count = 0; 
			}
		}
        return max;
    }
}

