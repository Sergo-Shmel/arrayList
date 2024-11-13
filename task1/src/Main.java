import java.util.ArrayList;
import java.util.List;

//Задача 1: Создание и вывод списка
//Описание:
//Создайте ArrayList типа String, добавьте в него 5 различных строк и выведите их на экран.
public class Main {
    public static void main(String[] args) {
        List<String> string = new ArrayList<>();
        string.add("Hello");
        string.add("World");
        string.add("String");
        string.add("Integer");
        string.add("Boolean");

        System.out.println(string);
    }
}