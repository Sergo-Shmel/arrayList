//Задача 2: Удаление элементов
//Описание:
//Создайте ArrayList целых чисел, добавьте в него 10 элементов.
// Удалите элемент по индексу 3 и выведите список после удаления.
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        ArrayList<Integer> integer = new ArrayList<>();
        integer.add(1);
        integer.add(2);
        integer.add(3);
        integer.add(4);
        integer.add(5);
        integer.add(6);
        integer.add(7);
        integer.add(8);
        integer.add(9);
        integer.add(10);
        integer.remove(3);
        System.out.println(integer);

    }
}
