import java.util.ArrayList;

//Объединение двух списков
//Описание:
//Создайте два списка ArrayList типа String и объедините их. Выведите итоговый список на экран.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list_first = new ArrayList<>();
        list_first.add("A");
        ArrayList<String> list_second = new ArrayList<>();
        list_second.add("B");
        list_first.addAll(list_second);
        System.out.println(list_first);
    }
}
