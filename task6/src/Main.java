import java.util.ArrayList;

//Удаление всех элементов, начинающихся на определенную букву
//Описание:
//Создайте ArrayList строк, добавьте в него несколько строк.
// Удалите все строки, которые начинаются на букву "A".
public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Abdula");
        strings.add("Alex");
        strings.add("Bob");
        strings.add("Catherine");

        for (int i = strings.size() - 1; i >= 0; i--) {
            if (strings.get(i).startsWith("A")) {
                strings.remove(i);
            }
        }

        System.out.println("Измененный список: " + strings);
    }
}
