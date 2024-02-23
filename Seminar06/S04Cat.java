/*
Урок 6. Хранение и обработка данных ч3: множество коллекций Set
https://gb.ru/lessons/414476


01:36:00

Задание №3
(Андрей Лопатько)
 */
package JavaSeminar.Seminar06;

/**
1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, 
можно использовать не все придуманные поля и методы. 
Создайте несколько экземпляров этого класса, выведите их в консоль.

2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, 
выводилась его кличка, цвет и возраст 
(другие параметры на ваше усмотрение).
 */
public class S04Cat {
    private String name;
    private int age;
    private String color;
    
    public S04Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override   // данное слово визуально отмечает код,  
                // переопределяющий строку
    public String toString() {
        return "Имя: " + name + 
        "\n" + "Цвет: " + color + 
        "\n" + "Возраст: " + age;
    }
}
