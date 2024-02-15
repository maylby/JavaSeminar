/*
Урок 1. Знакомство с языком программирования Java
https://gb.ru/lessons/414471


00:42:00
Циклы
 */

package JavaSeminar.Seminar01;

public class S04Cycles {
    public static void main(String[] args) {
        // println("");
    // }
    // public static String println(String x) {
        /*
         * Цикл while
         */

        double d = 5.0;
		while (d < 0) {
	
		}

        /*
         * цикл "fori" - стандартный "for"
         */
        int[] array = new int [7];
		for (int i = 0; i < array.length; i++) {/*
                                                перенос скобки на новую строку - 
                                                ошибка форматирования
                                                в Java открывающая скобка 
                                                ставится в конце строки
                                                инструмент форматирования вызывается
                                                сочетанием клавишь SHIFT+ALT+F
                                                или из меню панели инструментов,
                                                строка "Форматировать документ"
                                                 */

		}

        int arr[] = {1, 2, 3};
        /*
         * Система сообщает, что
         * Значение локальной переменной "iterable_element" не используется Java
         * Почему появилось данное сообщение?
         * Что не так?
         */
		for (int iterable_element : arr) { /*
                                            цикл "foreahc" - для коллекций
                                            (перебор элементов без индекса)
                                            указываем тип элемента (int),
                                            сам элемент (iterable_element) и 						   		   
                                            коллекцию (array), которую перебираем
                                            метод не позволяет изменять и удалять,
                                            можно только перебирать и выводить
                                            */ 
		
        }
        
        boolean b = true;
        if (b) {
                                                
        } else if (b) { 
             
        } else {
                                  
        }

    }
}

