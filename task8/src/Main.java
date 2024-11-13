import java.util.ArrayList;
import java.util.Objects;

//Удаление дубликатов
//Описание:
//Создайте ArrayList строк с повторяющимися значениями. Удалите все дубликаты из списка.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("B");
        list.add("C");
        list.add("A");

        for (int i = list.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(i);
                    break;
                }
            }
        }

        System.out.println(list);

    }
}
