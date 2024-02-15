/*
Урок 1. Знакомство с языком программирования Java
https://gb.ru/lessons/414471


00:50:50

Задание №1

Написать программу, которая запросит пользователя ввести 
<Имя> в консоли.
Получит введенную строку и выведет в консоль сообщение
“Привет, <Имя>!”


00:53:55

Решение 
(Генадий Ионов)

 */
package JavaSeminar.Seminar01;

// import java.io.PrintStream;
import java.util.Scanner;

public class S05NamePrint {
     	public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in, "ibm866"); 
                                                    // "ibm866" - кирилица
            System.out.println("Input you name:");
            String name = scanner.nextLine();
            String msg ="Hello, ";
            System.out.println(msg + name); // (?) Система не дала поставить запятую
                                            // между "msg" и "name", выдавала ошибку, 
                                            // подчёркивая красным метод "println".
                                            // знак "+" ошибки не вызвал (?)
            scanner.close(); // закрываем сканер во избежание утечки ресурса, т.к.
                             // "Scanner" работает с потоком (внешний ввод),
                             // подобные методы требуют закрытия (.close())

	}
}
