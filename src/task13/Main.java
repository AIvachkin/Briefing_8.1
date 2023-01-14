package task13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

//    Необходимо реализовать следующий метод:
//
//  На вход получаем список названий книг.
//  Распределяем книги по полкам так, чтобы на каждой полке было примерно одинаковое количество книг.
//  Все книги должны быть отсортированы по алфавиту с первой до последней полки.
//  Количество полок константное — 5 штук.
//  Вернуть книги, распределенные по полкам.


    public static void main(String[] args) {

//        если книг меньше, чем полок, метод не работает
//        нужно ввести доп.проверку и цикл на заполнение меньшего кол-ва полок



        final int shelf = 5;


        List<String> books = new ArrayList<>();
        books.add("Война и Мир");
        books.add("Гарри Поттер");
        books.add("Бесприданница");
        books.add("Малыш и Карлсон");
        books.add("Капитал");
        books.add("Хоббит");
        books.add("Властелин колец");
        books.add("Приключения Буратино");
        books.add("Приключения Пиноккио");
        books.add("Илиада");
        books.add("Одиссея");
        books.add("Незнайка на луне");
        books.add("Преступление и наказание");


        List<String> booksSorted = books.stream()
                .sorted()
                .collect(Collectors.toList());

        List<ArrayList<String>> shelves = new ArrayList<>();

        for (int i = 0; i < shelf; i++) {
            ArrayList<String> shelfArr = new ArrayList<>();
            shelves.add(shelfArr);
        }

        int shelfIndex = 0;
        int index = 0;
        int booksPerShelf = books.size() / shelf;
        int addBookShelf = books.size() % shelf;
        int temp = 0;
        ;


        while (index < books.size()) {

            for (int i = 0; i < booksPerShelf; i++) {
                shelves.get(shelfIndex).add(booksSorted.get(index));
                index++;
                if (addBookShelf > 0 && temp == 0) {
                    i--;
                    addBookShelf--;
                    temp ++;
                }
            }
            shelfIndex++;
            temp = 0;
        }

        shelves.forEach(System.out::println);

    }

}
