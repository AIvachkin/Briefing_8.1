package task12;

import java.util.Arrays;
import java.util.List;


public class Main {

//    Дан массив пар названий книг и авторов, необходимо привести
//    каждую пару в строку вида: "Название книги" И. О. Фамилия автора.

    public static void main(String[] args) {

//        Массив [3][2]
        String[][] booksAndAuthor = {
                {"Война и Мир", "Л.Н.Толстой"},
                {"Тихий Дон", "М.А.Шолохов"},
                {"Вий", "Н.В.Гоголь"}
        };

        for (String[] strings : booksAndAuthor) {
            System.out.println("'" + strings[0] + "' " + strings[1]);
        }

    }
}
