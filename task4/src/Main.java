import java.util.ArrayList;

//Задача 4: Перебор и изменение элементов
//Описание:
//Создайте ArrayList целых чисел и увеличьте каждый элемент на 2 с помощью цикла.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integer = new ArrayList<>();
        integer.add(1);
        integer.add(2);
        integer.add(3);

        for(int i = 0; i < integer.size(); i++) {
            integer.set(i, integer.get(i) + 2);
        }
        System.out.println(integer);

    }
}
