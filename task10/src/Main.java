import java.util.ArrayList;

//Реверс списка
//Описание:
//Создайте ArrayList строк, выведите список в обратном порядке.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            String temp = list.get(i);
            list.set(i, list.get(size - 1 - i));
            list.set(size - 1 - i, temp);
        }

        System.out.println(list);

    }
}
