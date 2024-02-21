/*
Урок 4. Хранение и обработка данных ч1: приоритетные коллекции
https://gb.ru/lessons/414474

00:48:40

Задание №1

Реализовать консольное приложение, которое:

1. Принимает от пользователя строку вида text~num
2. Нужно рассплитить строку по ~, 
   сохранить text в связный список на позицию num.
3. Если введено print~num, выводит строку из позиции num 
   в связном списке и удаляет её из списка.


Решение
(Андрей Лапотько)
 */
package JavaSeminar.Seminar04;
/*
 * 1. Принимает от пользователя строку вида text~num
 * 2. Нужно рассплитить строку по ~, сохранить text 
 *    в связный список на позицию num.
 * 3. Если введено print~num, выводит строку из позиции num 
      в связном списке и удаляет её из списка.
 */
import java.util.LinkedList;
import java.util.Scanner;

public class S02ParseStirng {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        messageForInput(); // вызов метода ввода и вывода
        String input = scanner.nextLine();
        LinkedList<String> data = new LinkedList<>();

        while (!input.equals("end")) { // пока "!input" не равен "!" "end"
            String[] inputSplit = input.split("~");
            String text = inputSplit[0];
            int index = Integer.parseInt(inputSplit[1]);

            if (text.equals("print")) {
                if (index >= 0 && index < data.size()) {
                    System.out.println(data.get(index));
                    System.out.println(data.remove(index));
                } else {
                    System.out.println("Неверная позиция!");
                }
                System.out.println(data); // контрольный вывод

            } else {
                if (index >= 0 && index <= data.size()) {
                    data.add(index, text);
                }
                else {
                    System.out.println("Неверная позиция!");
                }
                    System.out.println(data);
            }
            messageForInput();
            input = scanner.nextLine();
        }
        scanner.close();
    }
    /*
     * Три строки кода ниже выведены в отдельный метод "messageForInput"
     */
    private static void messageForInput() {
        System.out.println("Введите строку вида text~num для добавления элемента в список.");
        System.out.println("Для вывода и удаления из списка: print~num");
        System.out.println("Для выхода: end");
    }
}

