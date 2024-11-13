import java.util.ArrayList;

//Сортировка списка
//Описание:
//Создайте ArrayList строк, отсортируйте его в алфавитном порядке и выведите отсортированный список.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("C");
        list.add("D");
        list.add("B");

        list.sort(String::compareTo);
        System.out.println(list);
    }
}
