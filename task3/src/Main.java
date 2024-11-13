import java.util.ArrayList;
import java.util.Scanner;

//Задача 3: Поиск элемента в списке
//Описание:
//Создайте ArrayList строк, добавьте в него несколько элементов.
// Напишите программу, которая проверит наличие строки в списке и выведет её индекс, если она существует.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> string = new ArrayList<>();
        string.add("Hello");
        string.add("World");
        string.add("Java");

        Scanner scanner = new Scanner(System.in);
        for (String s : string) {
            if(scanner.next().equals(s)){
                System.out.println(string.indexOf(s));
            }
        }

    }
}
