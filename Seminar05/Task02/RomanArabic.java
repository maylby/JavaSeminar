/*
Урок 5. Хранение и обработка данных ч2: множество коллекций Map
https://gb.ru/lessons/414475


01:35:25

Задание №3

Написать метод, который переведет число 
из римского формата записи в арабский.

Например, MMXXII = 2022

http://graecolatini.bsu.by/htm-different/num-converter-roman.htm
Принципы римской с/с


Решение
(Марина Вершинина)

*/
package JavaSeminar.Seminar05.Task02;

import java.util.HashMap;
import java.util.Map;

public class RomanArabic {

public static void main(String[] args) {
    String romanNum = "MMXXIV";
    System.out.println(romanToArabic(romanNum));

    }
    public static Map<Character, Integer> getRomanArabicMap() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        return map;

    }
    public static int romanToArabic(String romanNumber) {
        Map<Character, Integer> map = getRomanArabicMap();
        int result = 0;
        int prefValue = 0;
        for (int i = romanNumber.length()-1; i >= 0; i--) {
            int currentValue = map.get(romanNumber.charAt(i));
            if (currentValue < prefValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            prefValue = currentValue;
        }
        return result;

    }
}