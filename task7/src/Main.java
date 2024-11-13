import java.util.ArrayList;

//Поиск максимального элемента
//Описание:
//Создайте ArrayList целых чисел. Найдите и выведите максимальный элемент в списке.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(8);
        numbers.add(4);

        int max = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }

        System.out.println(max);

    }
}
