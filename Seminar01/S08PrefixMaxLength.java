/*
Урок 1. Знакомство с языком программирования Java
https://gb.ru/lessons/414471


Задание №4 

Напишите метод, который находит самую длинную строку общего 
префикса среди массива строк.
Если общего префикса нет, вернуть пустую строку "".

 */
package JavaSeminar.Seminar01;

public class S08PrefixMaxLength {
    public static void main(String[] args) {
		String[] strs = {"flower", "flow", "flight"};
		String pref = findMaxLengthByPrefix(strs);
		System.out.print(pref);
	}

    private static String findMaxLengthByPrefix(String[] strs) {
        String pref = strs[0];
		for (int i = 1; i < strs.length; i++) {
			while (strs[i].indexOf(pref) != 0) {
				pref = pref.substring(0, pref.length()-1);
			}
			if (pref.isEmpty()) break; 
		}
        return pref;
    }
}
